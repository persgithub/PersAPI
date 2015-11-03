package us.or.state.pers.clarety.api.rest.person.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WSBPersonDetails {

    /**
	 * 
	 */
	private String dsgtn_cd;
	private String fst_nm;
	private String last_nm;
	private String mid_nm;
	private int prsn_id;
	private String sfx_cd;
	private java.util.Date brth_dt;
	private java.util.Date deth_dt;
	private String mrtl_stat_cd;
	private int nbk_id;
	private int prsn_opt_lck_ctl;
	private String sex_cd;
	private String ss_nr;
	private String pers_id; 
	private boolean senstv_in;
	private boolean SSDI_Err_In;
	private boolean non_Rsdnt_Aln;
	

	public String getDsgtn_cd() {
		return dsgtn_cd;
	}
	public void setDsgtn_cd(String dsgtn_cd) {
		this.dsgtn_cd = dsgtn_cd;
	}
	public String getFst_nm() {
		return fst_nm;
	}
	public void setFst_nm(String fst_nm) {
		this.fst_nm = fst_nm;
	}
	public String getLast_nm() {
		return last_nm;
	}
	public void setLast_nm(String last_nm) {
		this.last_nm = last_nm;
	}
	public String getMid_nm() {
		return mid_nm;
	}
	public void setMid_nm(String mid_nm) {
		this.mid_nm = mid_nm;
	}
	public int getPrsn_id() {
		return prsn_id;
	}
	public void setPrsn_id(int prsn_id) {
		this.prsn_id = prsn_id;
	}
	public String getSfx_cd() {
		return sfx_cd;
	}
	public void setSfx_cd(String sfx_cd) {
		this.sfx_cd = sfx_cd;
	}
	public java.util.Date getBrth_dt() {
		return brth_dt;
	}
	public void setBrth_dt(java.util.Date brth_dt) {
		this.brth_dt = brth_dt;
	}
	public java.util.Date getDeth_dt() {
		return deth_dt;
	}
	public void setDeth_dt(java.util.Date deth_dt) {
		this.deth_dt = deth_dt;
	}
	public String getMrtl_stat_cd() {
		return mrtl_stat_cd;
	}
	public void setMrtl_stat_cd(String mrtl_stat_cd) {
		this.mrtl_stat_cd = mrtl_stat_cd;
	}
	public int getNbk_id() {
		return nbk_id;
	}
	public void setNbk_id(int nbk_id) {
		this.nbk_id = nbk_id;
	}
	public int getPrsn_opt_lck_ctl() {
		return prsn_opt_lck_ctl;
	}
	public void setPrsn_opt_lck_ctl(int prsn_opt_lck_ctl) {
		this.prsn_opt_lck_ctl = prsn_opt_lck_ctl;
	}
	public String getSex_cd() {
		return sex_cd;
	}
	public void setSex_cd(String sex_cd) {
		this.sex_cd = sex_cd;
	}
	public String getSs_nr() {
		return ss_nr;
	}
	public void setSs_nr(String ss_nr) {
		this.ss_nr = ss_nr;
	}
	public String getPers_id() {
		return pers_id;
	}
	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}
	public boolean isSenstv_in() {
		return senstv_in;
	}
	public void setSenstv_in(boolean senstv_in) {
		this.senstv_in = senstv_in;
	}
	public boolean isSSDI_Err_In() {
		return SSDI_Err_In;
	}
	public void setSSDI_Err_In(boolean err_In) {
		SSDI_Err_In = err_In;
	}
	public boolean isNon_Rsdnt_Aln() {
		return non_Rsdnt_Aln;
	}
	public void setNon_Rsdnt_Aln(boolean non_Rsdnt_Aln) {
		this.non_Rsdnt_Aln = non_Rsdnt_Aln;
	}
	


}
