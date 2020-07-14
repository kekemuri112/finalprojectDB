package com.jhta.projectdb.vo;

public class ApproveProposalVo {
	private ProposalVo proVo;
	private BranchVo brVo;
	public ApproveProposalVo(ProposalVo proVo, BranchVo brVo) {
		super();
		this.proVo = proVo;
		this.brVo = brVo;
	}
	public ApproveProposalVo() {
		super();
	}
	public ProposalVo getProVo() {
		return proVo;
	}
	public void setProVo(ProposalVo proVo) {
		this.proVo = proVo;
	}
	public BranchVo getBrVo() {
		return brVo;
	}
	public void setBrVo(BranchVo brVo) {
		this.brVo = brVo;
	}
	
}
