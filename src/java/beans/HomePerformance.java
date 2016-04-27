/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Sergey
 */
@Named(value = "homePerformance")
@ApplicationScoped
public class HomePerformance {

    private int sqFt;
    private int total;
    private int insulateAttic;
    private int freshStart;
    private int crawlSpaceInsulation;
    private int SealDuctingToCodeComplianceStandards;
    private int airSealPackage;
    private int cAZAreaReport;
    private int installR8DuctingStandalone;
    private int installR8DuctingNewHVACSystem;
    private int newHVACSystemERIPrivateLabel8a;
    private int newHVACSystemERIPrivateLabel8b;
    private int includes10YearPartsAndLabor;
    private int singleDualZoneHVACSystem;
    private int relocateCondenser;
    private int cutInSupplyVentNewDuct;
    private int hVACCutIn;
    private int installWindows;
    private int miscItemsWindows;
    private int allGlazingIsTriplelowE;
    private int installPoolPump;
    private int installWholeHouseFan;
    private int installWaterHeater;
    private int permits;
    private int installBatteryOperatedCO;
    
    private String text;
    
    /**
     * Creates a new instance of HomePerformance
     */
    
    public HomePerformance() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public String reseiveTotal () {
//        String t = String.valueOf(total);
//        return t;
//    }
    
    public int getTotal() {
        total = getInsulateAttic() + getFreshStart() + getCrawlSpaceInsulation() 
                + getSealDuctingToCodeComplianceStandards() + getAirSealPackage()
                + getcAZAreaReport() +getInstallR8DuctingStandalone() + getInstallR8DuctingNewHVACSystem()
                + getNewHVACSystemERIPrivateLabel8a() + getNewHVACSystemERIPrivateLabel8b()
                + getSingleDualZoneHVACSystem() + getRelocateCondenser() + getCutInSupplyVentNewDuct()
                + gethVACCutIn() + getMiscItemsWindows() + getInstallPoolPump() + getInstallWholeHouseFan()
                ;
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    public int getInsulateAttic() {
        return insulateAttic;
    }

    public void setInsulateAttic(int insulateAttic) {
        this.insulateAttic = (int) (insulateAttic*1.25*getSqFt());
    }

    public int getFreshStart() {
        return freshStart;
    }

    public void setFreshStart(int freshStart) {
        this.freshStart = (int) (freshStart*1.5*getSqFt());
    }

    public int getCrawlSpaceInsulation() {
        return crawlSpaceInsulation;
    }

    public void setCrawlSpaceInsulation(int crawlSpaceInsulation) {
        this.crawlSpaceInsulation = (int) (crawlSpaceInsulation*2*getSqFt());
    }

    public int getSealDuctingToCodeComplianceStandards() {
        return SealDuctingToCodeComplianceStandards;
    }

    public void setSealDuctingToCodeComplianceStandards(int SealDuctingToCodeComplianceStandards) {
        this.SealDuctingToCodeComplianceStandards = (int) (SealDuctingToCodeComplianceStandards*1*getSqFt());
    }

    public int getAirSealPackage() {
        return airSealPackage;
    }

    public void setAirSealPackage(int airSealPackage) {
        this.airSealPackage = (int) (airSealPackage*2*getSqFt());
    }

    public int getcAZAreaReport() {
        return cAZAreaReport;
    }

    public void setcAZAreaReport(int cAZAreaReport) {
        this.cAZAreaReport = (int) (cAZAreaReport*1*getSqFt());
    }

    public int getInstallR8DuctingStandalone() {
        return installR8DuctingStandalone;
    }

    public void setInstallR8DuctingStandalone(int installR8DuctingStandalone) {
        this.installR8DuctingStandalone = (int) (installR8DuctingStandalone*2*getSqFt());
    }

    public int getInstallR8DuctingNewHVACSystem() {
        return installR8DuctingNewHVACSystem;
    }

    public void setInstallR8DuctingNewHVACSystem(int installR8DuctingNewHVACSystem) {
        this.installR8DuctingNewHVACSystem = (int) (installR8DuctingNewHVACSystem*1*getSqFt());
    }

    public int getNewHVACSystemERIPrivateLabel8a() {
        return newHVACSystemERIPrivateLabel8a;
    }

    public void setNewHVACSystemERIPrivateLabel8a(int newHVACSystemERIPrivateLabel8a) {
        this.newHVACSystemERIPrivateLabel8a = (int) (newHVACSystemERIPrivateLabel8a*1*getSqFt());
    }

    public int getNewHVACSystemERIPrivateLabel8b() {
        return newHVACSystemERIPrivateLabel8b;
    }

    public void setNewHVACSystemERIPrivateLabel8b(int newHVACSystemERIPrivateLabel8b) {
        this.newHVACSystemERIPrivateLabel8b = (int) (newHVACSystemERIPrivateLabel8b*1*getSqFt());
    }

    public int getIncludes10YearPartsAndLabor() {
        return includes10YearPartsAndLabor;
    }

    public void setIncludes10YearPartsAndLabor(int includes10YearPartsAndLabor) {
        this.includes10YearPartsAndLabor = includes10YearPartsAndLabor;
    }

    public int getSingleDualZoneHVACSystem() {
        return singleDualZoneHVACSystem;
    }

    public void setSingleDualZoneHVACSystem(int singleDualZoneHVACSystem) {
        this.singleDualZoneHVACSystem = (int) (singleDualZoneHVACSystem*2*getSqFt());
    }

    public int getRelocateCondenser() {
        return relocateCondenser;
    }

    public void setRelocateCondenser(int relocateCondenser) {
        this.relocateCondenser = (int) (relocateCondenser*1*getSqFt());
    }

    public int getCutInSupplyVentNewDuct() {
        return cutInSupplyVentNewDuct;
    }

    public void setCutInSupplyVentNewDuct(int cutInSupplyVentNewDuct) {
        this.cutInSupplyVentNewDuct = (int) (cutInSupplyVentNewDuct*1*getSqFt());
    }

    public int gethVACCutIn() {
        return hVACCutIn;
    }

    public void sethVACCutIn(int hVACCutIn) {
        this.hVACCutIn = (int) (hVACCutIn*1*getSqFt());
    }

    public int getInstallWindows() {
        return installWindows;
    }

    public void setInstallWindows(int installWindows) {
        this.installWindows = (int) (installWindows*1*getSqFt());
    }

    public int getMiscItemsWindows() {
        return miscItemsWindows;
    }

    public void setMiscItemsWindows(int miscItemsWindows) {
        this.miscItemsWindows = (int) (miscItemsWindows*1*getSqFt());
    }

    public int getAllGlazingIsTriplelowE() {
        return allGlazingIsTriplelowE;
    }

    public void setAllGlazingIsTriplelowE(int allGlazingIsTriplelowE) {
        this.allGlazingIsTriplelowE = allGlazingIsTriplelowE;
    }

    public int getInstallPoolPump() {
        return installPoolPump;
    }

    public void setInstallPoolPump(int installPoolPump) {
        this.installPoolPump = 1500;
    }

    public int getInstallWholeHouseFan() {
        return installWholeHouseFan;
    }

    public void setInstallWholeHouseFan(int installWholeHouseFan) {
        this.installWholeHouseFan = (int) (installWholeHouseFan*2*getSqFt());
    }

    public int getInstallWaterHeater() {
        return installWaterHeater;
    }

    public void setInstallWaterHeater(int installWaterHeater) {
        this.installWaterHeater = 1000;
    }

    public int getPermits() {
        return permits;
    }

    public void setPermits(int permits) {
        this.permits = 1;
    }

    public int getInstallBatteryOperatedCO() {
        return installBatteryOperatedCO;
    }

    public void setInstallBatteryOperatedCO(int installBatteryOperatedCO) {
        this.installBatteryOperatedCO = 1;
    }
}
