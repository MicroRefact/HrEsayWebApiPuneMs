import javax.persistence;
@Entity
@Table(name = "m_employees")
public class EmployeeMaster {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "emp_id")
 private  int empId;

@Column(name = "emp_code")
 private  String empCode;

@Column(name = "cmp_code")
 private  int cmpCode;

@Column(name = "sub_cmp_id")
 private  int subCmpId;

@Column(name = "emp_type")
 private  int empType;

@Column(name = "mobile_no_1")
 private  String mobileNo1;

@Column(name = "mobile_no_2")
 private  String mobileNo2;

@Column(name = "residence_land_no")
 private  String residenceLandNo;

@Column(name = "contractor_id")
 private  int contractorId;

@Column(name = "depart_id")
 private  int departId;

@Column(name = "designation_id")
 private  int designationId;

@Column(name = "location_id")
 private  int locationId;

@Column(name = "first_name ")
 private  String firstName;

@Column(name = "middle_name")
 private  String middleName;

@Column(name = "surname")
 private  String surname;

@Column(name = "mother_name")
 private  String motherName;

@Column(name = "society_serial_no")
 private  String societySerialNo;

@Column(name = "pan_card_no")
 private  String panCardNo;

@Column(name = "pf_no")
 private  String pfNo;

@Column(name = "esic_no")
 private  String esicNo;

@Column(name = "aadhar_no")
 private  String aadharNo;

@Column(name = "uan")
 private  String uan;

@Column(name = "leaving_reason")
 private  String leavingReason;

@Column(name = "is_emp")
 private  int isEmp;

@Column(name = "current_shiftid")
 private  int currentShiftid;

@Column(name = "next_shiftid")
 private  int nextShiftid;

@Column(name = "gross_salary_est")
 private  float grossSalaryEst;

@Column(name = "email_id")
 private  String emailId;

@Column(name = "notice_pay_amount")
 private  int noticePayAmount;

@Column(name = "sal_ded_at_fullandfinal")
 private  int salDedAtFullandfinal;

@Column(name = "added_from")
 private  int addedFrom;

@Column(name = "raw_data")
 private  String rawData;

@Column(name = "added_by_supervisor_id")
 private  int addedBySupervisorId;

@Column(name = "login_name")
 private  String loginName;

@Column(name = "login_time")
 private  String loginTime;

@Column(name = "pl_calc_base")
 private  int plCalcBase;

@Column(name = "earn_leave_opening_balance")
 private  float earnLeaveOpeningBalance;

@Column(name = "emp_category")
 private  String empCategory;

@Column(name = "exgratia_perc")
 private  float exgratiaPerc;

@Column(name = "new_basic_rate")
 private  float newBasicRate;

@Column(name = "new_hra_rate")
 private  float newHraRate;

@Column(name = "new_da_rate")
 private  float newDaRate;

@Column(name = "del_status")
 private  int delStatus;

@Column(name = "ex_int1")
 private  int exInt1;

@Column(name = "ex_int2")
 private  int exInt2;

@Column(name = "ex_var1")
 private  String exVar1;

@Column(name = "ex_var2")
 private  String exVar2;

@Column(name = "holiday_category ")
 private  int holidayCategory;

@Column(name = "weekend_category ")
 private  int weekendCategory;


public void setEsicNo(String esicNo){
    this.esicNo = esicNo;
}


public String getExVar2(){
    return exVar2;
}


public void setCmpCode(int cmpCode){
    this.cmpCode = cmpCode;
}


public void setEmpType(int empType){
    this.empType = empType;
}


public String getExVar1(){
    return exVar1;
}


public float getNewHraRate(){
    return newHraRate;
}


public int getIsEmp(){
    return isEmp;
}


public void setExInt1(int exInt1){
    this.exInt1 = exInt1;
}


public void setLoginName(String loginName){
    this.loginName = loginName;
}


public String getAadharNo(){
    return aadharNo;
}


public void setAddedFrom(int addedFrom){
    this.addedFrom = addedFrom;
}


public int getEmpType(){
    return empType;
}


public void setExInt2(int exInt2){
    this.exInt2 = exInt2;
}


public int getAddedFrom(){
    return addedFrom;
}


public void setExVar2(String exVar2){
    this.exVar2 = exVar2;
}


public void setSalDedAtFullandfinal(int salDedAtFullandfinal){
    this.salDedAtFullandfinal = salDedAtFullandfinal;
}


public float getNewBasicRate(){
    return newBasicRate;
}


public int getEmpId(){
    return empId;
}


public String getLoginName(){
    return loginName;
}


public void setEmpId(int empId){
    this.empId = empId;
}


public void setSubCmpId(int subCmpId){
    this.subCmpId = subCmpId;
}


public int getNextShiftid(){
    return nextShiftid;
}


public int getSalDedAtFullandfinal(){
    return salDedAtFullandfinal;
}


public String getRawData(){
    return rawData;
}


public int getCmpCode(){
    return cmpCode;
}


public void setDelStatus(int delStatus){
    this.delStatus = delStatus;
}


public String getLeavingReason(){
    return leavingReason;
}


public void setNewHraRate(float newHraRate){
    this.newHraRate = newHraRate;
}


public float getNewDaRate(){
    return newDaRate;
}


public int getExInt2(){
    return exInt2;
}


public void setContractorId(int contractorId){
    this.contractorId = contractorId;
}


public void setNextShiftid(int nextShiftid){
    this.nextShiftid = nextShiftid;
}


public int getExInt1(){
    return exInt1;
}


public String getPanCardNo(){
    return panCardNo;
}


public int getDesignationId(){
    return designationId;
}


public int getAddedBySupervisorId(){
    return addedBySupervisorId;
}


public void setEmpCode(String empCode){
    this.empCode = empCode;
}


public String getPfNo(){
    return pfNo;
}


public int getSubCmpId(){
    return subCmpId;
}


public String getResidenceLandNo(){
    return residenceLandNo;
}


public void setAadharNo(String aadharNo){
    this.aadharNo = aadharNo;
}


public void setExVar1(String exVar1){
    this.exVar1 = exVar1;
}


public void setMotherName(String motherName){
    this.motherName = motherName;
}


public void setMiddleName(String middleName){
    this.middleName = middleName;
}


public String getMotherName(){
    return motherName;
}


public void setSocietySerialNo(String societySerialNo){
    this.societySerialNo = societySerialNo;
}


public int getHolidayCategory(){
    return holidayCategory;
}


public String getEmpCode(){
    return empCode;
}


public int getDelStatus(){
    return delStatus;
}


public String getMobileNo2(){
    return mobileNo2;
}


@Override
public String toString(){
    return "EmployeeMaster [empId=" + empId + ", empCode=" + empCode + ", cmpCode=" + cmpCode + ", subCmpId=" + subCmpId + ", empType=" + empType + ", mobileNo1=" + mobileNo1 + ", mobileNo2=" + mobileNo2 + ", residenceLandNo=" + residenceLandNo + ", contractorId=" + contractorId + ", departId=" + departId + ", designationId=" + designationId + ", locationId=" + locationId + ", firstName=" + firstName + ", middleName=" + middleName + ", surname=" + surname + ", motherName=" + motherName + ", societySerialNo=" + societySerialNo + ", panCardNo=" + panCardNo + ", pfNo=" + pfNo + ", esicNo=" + esicNo + ", aadharNo=" + aadharNo + ", uan=" + uan + ", leavingReason=" + leavingReason + ", isEmp=" + isEmp + ", currentShiftid=" + currentShiftid + ", nextShiftid=" + nextShiftid + ", grossSalaryEst=" + grossSalaryEst + ", emailId=" + emailId + ", noticePayAmount=" + noticePayAmount + ", salDedAtFullandfinal=" + salDedAtFullandfinal + ", addedFrom=" + addedFrom + ", rawData=" + rawData + ", addedBySupervisorId=" + addedBySupervisorId + ", loginName=" + loginName + ", loginTime=" + loginTime + ", plCalcBase=" + plCalcBase + ", earnLeaveOpeningBalance=" + earnLeaveOpeningBalance + ", empCategory=" + empCategory + ", exgratiaPerc=" + exgratiaPerc + ", newBasicRate=" + newBasicRate + ", newHraRate=" + newHraRate + ", newDaRate=" + newDaRate + ", delStatus=" + delStatus + ", exInt1=" + exInt1 + ", exInt2=" + exInt2 + ", exVar1=" + exVar1 + ", exVar2=" + exVar2 + ", holidayCategory=" + holidayCategory + ", weekendCategory=" + weekendCategory + "]";
}


public int getWeekendCategory(){
    return weekendCategory;
}


public String getMobileNo1(){
    return mobileNo1;
}


public void setPanCardNo(String panCardNo){
    this.panCardNo = panCardNo;
}


public int getLocationId(){
    return locationId;
}


public void setEmailId(String emailId){
    this.emailId = emailId;
}


public String getEmailId(){
    return emailId;
}


public void setPlCalcBase(int plCalcBase){
    this.plCalcBase = plCalcBase;
}


public int getContractorId(){
    return contractorId;
}


public void setNoticePayAmount(int noticePayAmount){
    this.noticePayAmount = noticePayAmount;
}


public int getPlCalcBase(){
    return plCalcBase;
}


public String getEmpCategory(){
    return empCategory;
}


public void setPfNo(String pfNo){
    this.pfNo = pfNo;
}


public void setUan(String uan){
    this.uan = uan;
}


public String getUan(){
    return uan;
}


public void setExgratiaPerc(float exgratiaPerc){
    this.exgratiaPerc = exgratiaPerc;
}


public void setEmpCategory(String empCategory){
    this.empCategory = empCategory;
}


public String getSocietySerialNo(){
    return societySerialNo;
}


public void setFirstName(String firstName){
    this.firstName = firstName;
}


public void setDepartId(int departId){
    this.departId = departId;
}


public void setMobileNo2(String mobileNo2){
    this.mobileNo2 = mobileNo2;
}


public void setMobileNo1(String mobileNo1){
    this.mobileNo1 = mobileNo1;
}


public void setHolidayCategory(int holidayCategory){
    this.holidayCategory = holidayCategory;
}


public float getEarnLeaveOpeningBalance(){
    return earnLeaveOpeningBalance;
}


public void setCurrentShiftid(int currentShiftid){
    this.currentShiftid = currentShiftid;
}


public void setRawData(String rawData){
    this.rawData = rawData;
}


public void setWeekendCategory(int weekendCategory){
    this.weekendCategory = weekendCategory;
}


public String getMiddleName(){
    return middleName;
}


public int getNoticePayAmount(){
    return noticePayAmount;
}


public String getLoginTime(){
    return loginTime;
}


public void setLoginTime(String loginTime){
    this.loginTime = loginTime;
}


public void setIsEmp(int isEmp){
    this.isEmp = isEmp;
}


public void setSurname(String surname){
    this.surname = surname;
}


public void setLeavingReason(String leavingReason){
    this.leavingReason = leavingReason;
}


public void setEarnLeaveOpeningBalance(float earnLeaveOpeningBalance){
    this.earnLeaveOpeningBalance = earnLeaveOpeningBalance;
}


public void setNewBasicRate(float newBasicRate){
    this.newBasicRate = newBasicRate;
}


public String getEsicNo(){
    return esicNo;
}


public int getCurrentShiftid(){
    return currentShiftid;
}


public void setAddedBySupervisorId(int addedBySupervisorId){
    this.addedBySupervisorId = addedBySupervisorId;
}


public void setGrossSalaryEst(float grossSalaryEst){
    this.grossSalaryEst = grossSalaryEst;
}


public void setResidenceLandNo(String residenceLandNo){
    this.residenceLandNo = residenceLandNo;
}


public float getExgratiaPerc(){
    return exgratiaPerc;
}


public int getDepartId(){
    return departId;
}


public void setNewDaRate(float newDaRate){
    this.newDaRate = newDaRate;
}


public void setLocationId(int locationId){
    this.locationId = locationId;
}


public void setDesignationId(int designationId){
    this.designationId = designationId;
}


public float getGrossSalaryEst(){
    return grossSalaryEst;
}


public String getFirstName(){
    return firstName;
}


public String getSurname(){
    return surname;
}


}