package com.spark.easyleave;

public class LeaveRecords {
        boolean approved;
        int uid;
        String fromDate;
        String toDate;
        String reason;
        String supEmail;
        public LeaveRecords(boolean approved, int uid, String fromDate,String toDate, String reason, String supEmail) {
                this.approved = approved;
                this.uid = uid;
                this.fromDate = fromDate;
                this.toDate = toDate;
                this.reason = reason;
                this.supEmail = supEmail;
        }
        public int getUid() {
                return uid;
        }

        public void setUid(int uid) {
                this.uid = uid;
        }

        public String getFromDate() {
                return fromDate;
        }
        public void setFromDate(String fromDate) {
                this.fromDate = fromDate;
        }

        public String getToDate() {
                return toDate;
        }

        public void setToDate(String toDate) {
                this.toDate = toDate;
        }
        public String getReason(){
                return reason;
        }

        public void setReason(String reason) {
                this.reason = reason;
        }

        public String getSupEmail() {
                return supEmail;
        }

        public void setSupEmail(String supEmail) {
                this.supEmail = supEmail;
        }

        public boolean isApproved() {
                return approved;
        }

        public void setApproved(boolean approved) {
                this.approved = approved;
        }
}
