/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import DB.ReasonFroCareProgram;
import DB.StateQualifierMedianIncome75K;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;

/**
 *
 * @author Sergey
 */
@Named(value = "questions")
@SessionScoped
public class Questions implements Serializable {

    /**
     * Creates a new instance of SaleStart
     */
    

    private int customerID;
    private Date firstMeeting;
    private Date followUpWithES;
    private String advisor;
    private String ambassador;
    private String firstName1;
    private String lastName1;
    private String email1;
    private String phone1;
    private String firstName2;
    private String lastName2;
    private String email2;
    private String phone2;
    private String address;
    private String city;
    private int zip;
    private int squareFootage;
    private int yearHome;
    private String EffciencyUpgrades;
    private int ficoScore;
    private String stateQualifierMedianIncome75K;
    private String freePGEWeatherStripping;
    private String[] reasonForCareProgram;
    private String timeTravelExplained;
    private String qualifyToSpeakWithHub;
    private String additionalNOTES;
    private String director;
    private int numberOfAppointments;
    private String CustomAddUser;
    private int mileage;

    public Questions() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getFirstMeeting() {
        return firstMeeting;
    }

    public void setFirstMeeting(Date firstMeeting) {
        this.firstMeeting = firstMeeting;
    }

    public Date getFollowUpWithES() {
        return followUpWithES;
    }

    public void setFollowUpWithES(Date followUpWithES) {
        this.followUpWithES = followUpWithES;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getAmbassador() {
        return ambassador;
    }

    public void setAmbassador(String ambassador) {
        this.ambassador = ambassador;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getFirstName2() {
        return firstName2;
    }

    public void setFirstName2(String firstName2) {
        this.firstName2 = firstName2;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getYearHome() {
        return yearHome;
    }

    public void setYearHome(int yearHome) {
        this.yearHome = yearHome;
    }

    public String getEffciencyUpgrades() {
        return EffciencyUpgrades;
    }

    public void setEffciencyUpgrades(String EffciencyUpgrades) {
        this.EffciencyUpgrades = EffciencyUpgrades;
    }

    public int getFicoScore() {
        return ficoScore;
    }

    public void setFicoScore(int ficoScore) {
        this.ficoScore = ficoScore;
    }

    public String getStateQualifierMedianIncome75K() {
        return stateQualifierMedianIncome75K;
    }

    public void setStateQualifierMedianIncome75K(String stateQualifierMedianIncome75K) {
        this.stateQualifierMedianIncome75K = stateQualifierMedianIncome75K;
    }

    public String getFreePGEWeatherStripping() {
        return freePGEWeatherStripping;
    }

    public void setFreePGEWeatherStripping(String freePGEWeatherStripping) {
        this.freePGEWeatherStripping = freePGEWeatherStripping;
    }

    public String[] getReasonForCareProgram() {
        return reasonForCareProgram;
    }

    public void setReasonForCareProgram(String[] reasonForCareProgram) {
        this.reasonForCareProgram = reasonForCareProgram;
    }

    public String getTimeTravelExplained() {
        return timeTravelExplained;
    }

    public void setTimeTravelExplained(String timeTravelExplained) {
        this.timeTravelExplained = timeTravelExplained;
    }

    public String getQualifyToSpeakWithHub() {
        return qualifyToSpeakWithHub;
    }

    public void setQualifyToSpeakWithHub(String qualifyToSpeakWithHub) {
        this.qualifyToSpeakWithHub = qualifyToSpeakWithHub;
    }

    public String getAdditionalNOTES() {
        return additionalNOTES;
    }

    public void setAdditionalNOTES(String additionalNOTES) {
        this.additionalNOTES = additionalNOTES;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNumberOfAppointments() {
        return numberOfAppointments;
    }

    public void setNumberOfAppointments(int numberOfAppointments) {
        this.numberOfAppointments = numberOfAppointments;
    }

    public String getCustomAddUser() {
        return CustomAddUser;
    }

    public void setCustomAddUser(String CustomAddUser) {
        this.CustomAddUser = CustomAddUser;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void submit() {
        System.out.println("" + this.toString());
    }

    public void reset() {
        Date date = new Date();
        int customerID = 0;
        Date firstMeeting = date;
        setFollowUpWithES(date);
        setAdvisor("select");
        setAmbassador("select");
        setFirstName1("");
        setLastName1("");
        setEmail1("");
        setPhone1("");
        setFirstName2("");
        setLastName2("");
        setEmail2("");
        setPhone2("");
        setAddress("");
        setCity("");
        setZip(0);
        setSquareFootage(0);
        setYearHome(0);
        setEffciencyUpgrades("");
        setFicoScore(0);
        setStateQualifierMedianIncome75K("");
        setFreePGEWeatherStripping("");
//        setReasonForCareProgram(s);  // need to handle clearing field
        setTimeTravelExplained("");
        setQualifyToSpeakWithHub("");
        setAdditionalNOTES("");
        setDirector("select");
        setNumberOfAppointments(0);
        setCustomAddUser("");
        setMileage(0);

        System.out.println("" + this.toString());
    }

    public String printReasonforCareProgram() {
        StringBuilder sb = new StringBuilder();
        for (String s : reasonForCareProgram) {
            sb.append(s).append(", ");
        }
        return sb.toString();
    }

    public void sendNotification() {
//        function.sendingEmail("svolchenkov@gmail.com", "ConfirmingNotise");
    }

    @Override
    public String toString() {
        return "Questions{" + "customerID=" + customerID + ", firstMeeting=" + firstMeeting
                + ", followUpWithES=" + followUpWithES + ", advisor=" + advisor + ", ambassador="
                + ambassador + ", firstName1=" + firstName1 + ", lastName1=" + lastName1
                + ", email1=" + email1 + ", phone1=" + phone1 + ", firstName2=" + firstName2
                + ", lastName2=" + lastName2 + ", email2=" + email2 + ", phone2=" + phone2
                + ", address=" + address + ", city=" + city + ", zip=" + zip + ", squareFootage="
                + squareFootage + ", yearHome=" + yearHome + ", EffciencyUpgrades="
                + EffciencyUpgrades + ", ficoScore=" + ficoScore + ", stateQualifierMedianIncome75K="
                + stateQualifierMedianIncome75K + ", freePGEWeatherStripping=" + freePGEWeatherStripping
                + ", reasonForCareProgram=" + printReasonforCareProgram() + ", timeTravelExplained="
                + timeTravelExplained + ", qualifyToSpeakWithHub=" + qualifyToSpeakWithHub
                + ", additionalNOTES=" + additionalNOTES + ", director=" + director
                + ", numberOfAppointments=" + numberOfAppointments + ", CustomAddUser="
                + CustomAddUser + ", mileage=" + mileage + '}';
    }

}
