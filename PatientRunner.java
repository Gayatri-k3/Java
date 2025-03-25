class PatientRunner{
	public static void main(String[] args) {
		Patient patient = new Patient();
		System.out.println("Default value of infectious: "+patient.infectious);
		System.out.println("Default value of admitted: "+patient.admitted);
		System.out.println("Default value of disease: "+patient.disease);
		System.out.println("Default value of conditionType: "+patient.conditionType);
		patient.infectious = true;
		patient.admitted = true;
		patient.disease = "Corona";
		patient.conditionType = "chronic";
		System.out.println("Updated value of infectious: "+patient.infectious);
		System.out.println("Updated value of admitted: "+patient.admitted);
		System.out.println("Updated value of disease: "+patient.disease);
		System.out.println("Updated value of conditionType: "+patient.conditionType);
	}
}