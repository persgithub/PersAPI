package us.or.state.pers.iap.api.rest.disb.beans;

import java.util.Date;

import us.or.state.pers.iap.api.rest.base.beans.WSBaseBean;


public class WSBRtrmtRqst extends WSBaseBean {

		
		private static final long serialVersionUID = -5452364562348164234L;
		
		private long disbursementReqID;
		
		private String dsbrsmtMthdCD;
		
		private String fedTaxFilingStatCd;

		private String stTaxFilingStatCD;

		private String ageVrfNm;
		
		private Date effRtrmtDt;
		
		private Date ageVrfDt;

		private int fedTaxXmptn;

		private int stTaxXmptn;

		private String statusCD;
		
		private String rtrtmtTypCD;
		
		private int thirtyDayWvr;

		private Date thirtyDayWvrSigDt;

		private Date cnclRqstDt;

		private Date nextRtrmtDt;

		private String benefitGroup;


		/**
		 * @return the disbursementReqID
		 */
		public long getDisbursementReqID() {
			return disbursementReqID;
		}

		/**
		 * @param disbursementReqID the disbursementReqID to set
		 */
		public void setDisbursementReqID(long disbursementReqID) {
			this.disbursementReqID = disbursementReqID;
		}

		/**
		 * @return the dsbrsmtMthdCD
		 */
		public String getDsbrsmtMthdCD() {
			return dsbrsmtMthdCD;
		}

		/**
		 * @param dsbrsmtMthdCD set
		 */
		public void setDsbrsmtMthdCD(String dsbrsmtMthdCD) {
			this.dsbrsmtMthdCD = dsbrsmtMthdCD;
		}
		
		/**
		 * @return the fedTaxFilingStatCd
		 */
		public String getFedTaxFilingStatCd() {
			return fedTaxFilingStatCd;
		}

		/**
		 * @param fedTaxFilingStatCd to set
		 */
		public void setFedTaxFilingStatCd(String fedTaxFilingStatCd) {
			this.fedTaxFilingStatCd = fedTaxFilingStatCd;
		}
		
		/**
		 * @return the stTaxFilingStatCD
		 */
		public String getStTaxFilingStatCD() {
			return stTaxFilingStatCD;
		}

		/**
		 * @param disbursementReq to set
		 */
		public void setStTaxFilingStatCD(String stTaxFilingStatCD) {
			this.stTaxFilingStatCD = stTaxFilingStatCD;
		}

		/**
		 * @return the ageVrfNm
		 */
		public String getAgeVrfNm() {
			return ageVrfNm;
		}

		/**
		 * @param ageVrfNm to set
		 */
		public void setAgeVrfNm(String ageVrfNm) {
			this.ageVrfNm = ageVrfNm;
		}

		/**
		 * @return the effRtrmtDt
		 */
		public Date getEffRtrmtDt() {
			return effRtrmtDt;
		}

		/**
		 * @param effRtrmtDt to set
		 */
		public void setEffRtrmtDt(Date effRtrmtDt) {
			this.effRtrmtDt = effRtrmtDt;
		}

		/**
		 * @return the ageVrfDt
		 */
		public Date getAgeVrfDt() {
			return ageVrfDt;
		}

		/**
		 * @param disbursementReq the ageVrfDt to set
		 */
		public void setAgeVrfDt(Date ageVrfDt) {
			this.ageVrfDt = ageVrfDt;
		}

		/**
		 * @return the fedTaxXmptn
		 */
		public int getFedTaxXmptn() {
			return fedTaxXmptn;
		}

		/**
		 * @param disbursementReq the disbursementReq to set
		 */
		public void setFedTaxXmptn(int fedTaxXmptn) {
			this.fedTaxXmptn = fedTaxXmptn;
		}

		/**
		 * @return the stTaxXmptn
		 */
		public int getStTaxXmptn() {
			return stTaxXmptn;
		}

		/**
		 * @param disbursementReq the stTaxXmptn to set
		 */
		public void setStTaxXmptn(int stTaxXmptn) {
			this.stTaxXmptn = stTaxXmptn;
		}

		
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		/**
		 * @return the statusCD
		 */
		public String getStatusCD() {
			return statusCD;
		}

		/**
		 * @param statusCD the statusCD to set
		 */
		public void setStatusCD(String statusCD) {
			this.statusCD = statusCD;
		}

		/**
		 * @return the rtrtmtTypCD
		 */
		public String getRtrtmtTypCD() {
			return rtrtmtTypCD;
		}

		/**
		 * @param rtrtmtTypCD the rtrtmtTypCD to set
		 */
		public void setRtrtmtTypCD(String rtrtmtTypCD) {
			this.rtrtmtTypCD = rtrtmtTypCD;
		}

		/**
		 * @return the thirtyDayWvr
		 */
		public int getThirtyDayWvr() {
			return thirtyDayWvr;
		}

		/**
		 * @param thirtyDayWvr the thirtyDayWvr to set
		 */
		public void setThirtyDayWvr(int thirtyDayWvr) {
			this.thirtyDayWvr = thirtyDayWvr;
		}

		/**
		 * @return the thirtyDayWvrSigDt
		 */
		public Date getThirtyDayWvrSigDt() {
			return thirtyDayWvrSigDt;
		}

		/**
		 * @param thirtyDayWvrSigDt the thirtyDayWvrSigDt to set
		 */
		public void setThirtyDayWvrSigDt(Date thirtyDayWvrSigDt) {
			this.thirtyDayWvrSigDt = thirtyDayWvrSigDt;
		}

		/**
		 * @return the cnclRqstDt
		 */
		public Date getCnclRqstDt() {
			return cnclRqstDt;
		}

		/**
		 * @param cnclRqstDt the cnclRqstDt to set
		 */
		public void setCnclRqstDt(Date cnclRqstDt) {
			this.cnclRqstDt = cnclRqstDt;
		}

		/**
		 * @return the nextRtrmtDt
		 */
		public Date getNextRtrmtDt() {
			return nextRtrmtDt;
		}

		/**
		 * @param nextRtrmtDt the nextRtrmtDt to set
		 */
		public void setNextRtrmtDt(Date nextRtrmtDt) {
			this.nextRtrmtDt = nextRtrmtDt;
		}

		/**
		 * @return the benefitGroup
		 */
		public String getBenefitGroup() {
			return benefitGroup;
		}

		/**
		 * @param benefitGroup the benefitGroup to set
		 */
		public void setBenefitGroup(String benefitGroup) {
			this.benefitGroup = benefitGroup;
		}
		
	}


