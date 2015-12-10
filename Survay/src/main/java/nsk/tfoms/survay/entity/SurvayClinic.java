package nsk.tfoms.survay.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SURVAY_CLINIC database table.
 * 
 */
@Entity
@Table(name="SURVAY_CLINIC")
@NamedQuery(name="SurvayClinic.findAll", query="SELECT s FROM SurvayClinic s")
public class SurvayClinic implements Serializable {
	private static final long serialVersionUID = 1L;

	private String age;

	private String ambulance;

	@Column(name="CLINIC_DOCTOR")
	private String clinicDoctor;

	@Temporal(TemporalType.DATE)
	@Column(name="DATA_INPUT")
	private Date dataInput;

	@Temporal(TemporalType.DATE)
	@Column(name="DATA_RESP")
	private Date dataResp;

	@Column(name="DIAGNOSTIC_TESTS")
	private String diagnosticTests;

	private String equipment;

	@Column(name="FREE_HELP")
	private String freeHelp;
	
	@Id
	@GeneratedValue
	private BigDecimal id;

	@Column(name="LABORATORY_RESEARCH")
	private String laboratoryResearch;

	@Column(name="MEDICAL_SPECIALISTS")
	private String medicalSpecialists;

	private String polzovatel;

	@Column(name="QUALITY_AMBULANCE")
	private String qualityAmbulance;

	private String repairs;

	@Column(name="SEE_A_DOCTOR")
	private String seeADoctor;

	private String sex;

	private String therapist;

	@Column(name="WAITING_TIME")
	private String waitingTime;

	@Column(name="WAITING_TIME_2")
	private String waitingTime2;

	public SurvayClinic() {
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAmbulance() {
		return this.ambulance;
	}

	public void setAmbulance(String ambulance) {
		this.ambulance = ambulance;
	}

	public String getClinicDoctor() {
		return this.clinicDoctor;
	}

	public void setClinicDoctor(String clinicDoctor) {
		this.clinicDoctor = clinicDoctor;
	}

	public Date getDataInput() {
		return this.dataInput;
	}

	public void setDataInput(Date dataInput) {
		this.dataInput = dataInput;
	}

	public Date getDataResp() {
		return this.dataResp;
	}

	public void setDataResp(Date dataResp) {
		this.dataResp = dataResp;
	}

	public String getDiagnosticTests() {
		return this.diagnosticTests;
	}

	public void setDiagnosticTests(String diagnosticTests) {
		this.diagnosticTests = diagnosticTests;
	}

	public String getEquipment() {
		return this.equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getFreeHelp() {
		return this.freeHelp;
	}

	public void setFreeHelp(String freeHelp) {
		this.freeHelp = freeHelp;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getLaboratoryResearch() {
		return this.laboratoryResearch;
	}

	public void setLaboratoryResearch(String laboratoryResearch) {
		this.laboratoryResearch = laboratoryResearch;
	}

	public String getMedicalSpecialists() {
		return this.medicalSpecialists;
	}

	public void setMedicalSpecialists(String medicalSpecialists) {
		this.medicalSpecialists = medicalSpecialists;
	}

	public String getPolzovatel() {
		return this.polzovatel;
	}

	public void setPolzovatel(String polzovatel) {
		this.polzovatel = polzovatel;
	}

	public String getQualityAmbulance() {
		return this.qualityAmbulance;
	}

	public void setQualityAmbulance(String qualityAmbulance) {
		this.qualityAmbulance = qualityAmbulance;
	}

	public String getRepairs() {
		return this.repairs;
	}

	public void setRepairs(String repairs) {
		this.repairs = repairs;
	}

	public String getSeeADoctor() {
		return this.seeADoctor;
	}

	public void setSeeADoctor(String seeADoctor) {
		this.seeADoctor = seeADoctor;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTherapist() {
		return this.therapist;
	}

	public void setTherapist(String therapist) {
		this.therapist = therapist;
	}

	public String getWaitingTime() {
		return this.waitingTime;
	}

	public void setWaitingTime(String waitingTime) {
		this.waitingTime = waitingTime;
	}

	public String getWaitingTime2() {
		return this.waitingTime2;
	}

	public void setWaitingTime2(String waitingTime2) {
		this.waitingTime2 = waitingTime2;
	}

}