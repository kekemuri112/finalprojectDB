package com.jhta.projectdb.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public String post(String strUrl, String jsonString) {
		try {
			System.out.println(strUrl);
			URL url = new URL(strUrl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(5000); // �꽌踰꾩뿉 �뿰寃곕릺�뒗 Timeout �떆媛� �꽕�젙
			con.setReadTimeout(5000); // InputStream �씫�뼱 �삤�뒗 Timeout �떆媛� �꽕�젙
			// con.addRequestProperty("x-api-key", RestTestCommon.API_KEY); //key媛� �꽕�젙
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoInput(true);
			con.setDoOutput(true); // POST �뜲�씠�꽣瑜� OutputStream�쑝濡� �꽆寃� 二쇨쿋�떎�뒗 �꽕�젙
			con.setUseCaches(false);
			con.setDefaultUseCaches(false);

			OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
			wr.write(jsonString); // json �삎�떇�쓽 message �쟾�떖
			System.out.println("message �쟾�떖...");
			wr.flush();

			StringBuilder sb = new StringBuilder();
			if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				// Stream�쓣 泥섎━�빐以섏빞 �븯�뒗 洹�李��쓬�씠 �엳�쓬.
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line).append("\n");
				}
				br.close();
				return sb.toString();
			} else {
				System.out.println(con.getResponseMessage());
				return null;
			}
		} catch (Exception e) {
			System.err.println(e.toString());
			return null;
		}
	}

	public void get(String strUrl) {
		try {
			URL url = new URL(strUrl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(5000); // �꽌踰꾩뿉 �뿰寃곕릺�뒗 Timeout �떆媛� �꽕�젙
			con.setReadTimeout(5000); // InputStream �씫�뼱 �삤�뒗 Timeout �떆媛� �꽕�젙

			con.setRequestMethod("GET");

			con.setDoOutput(false);

			StringBuilder sb = new StringBuilder();
			if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line).append("\n");
				}
				br.close();
				System.out.println("" + sb.toString());
			} else {
				System.out.println(con.getResponseMessage());
			}

		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

}
