/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Calendar;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Sergey
 */
@Named(value = "dashBoard")
@ApplicationScoped
public class DashBoard {

    /**
     * Creates a new instance of DashBoard
     */
    private int countSolar;
    private int annualKWs;
    private String utilityDistrict;
    private int introduceVehicle;
    private int enabledSolar;
    private int enabledHomePerformance;
    private int numberOfPanel;
    private int costOfSolar;
    private int anySolarAdders;
    private int grossHP;
    private int information;
    private int totalHP;
    private int totalSolar;

    private int spendKW;
    private int grossSolarF;
    private int grossHPF;
    private int grossEV;
    private int grossProjectCost;
    private int currentMoPaymant;
    private double moPaymentPercent;
    private int moPaymentYears;
    private int moPaymentAmount;
    private int moPaymentSolarHPP;
    private int annualKWafterHPP;
    private int moPaymentToCompany;
    private int costPerKW;

    private int wantMinEvaluate;
    private int wantMaxEvaluate;

    //point for diagram
    private int series1_string0_column1,
            series1_string1_column1,
            series1_string2_column1,
            series1_string3_column1,
            series1_string4_column1,
            series1_string5_column1;
    private double series1_string0_column2,
            series1_string1_column2,
            series1_string2_column2,
            series1_string3_column2,
            series1_string4_column2,
            series1_string5_column2,
            series2_string0_column2,
            series2_string1_column2,
            series2_string2_column2,
            series2_string3_column2,
            series2_string4_column2,
            series2_string5_column2;

    public DashBoard() {
    }

    public void setMoPaymentToCompany(int moPaymentToCompany) {
        this.moPaymentToCompany = moPaymentToCompany;
    }

    public int getMoPaymentToCompany() {
        if ((getAnnualKWafterHPP() / 12) < 660) {
            moPaymentToCompany = (int) (getAnnualKWafterHPP() / 12 * 0.1);
        } else {
            moPaymentToCompany = (int) ((660 * 0.1) + (getAnnualKWafterHPP() / 12 - 660) * 0.19);
        }
        return moPaymentToCompany;
    }

    public int getAnnualKWafterHPP() {
        this.annualKWafterHPP = getSpendKW();
        if (this.enabledHomePerformance == 1) {
            this.annualKWafterHPP = (int) (getSpendKW() * 0.8);
        }
        this.annualKWafterHPP = this.annualKWafterHPP - (getWantMaxEvaluate() - getWantMinEvaluate()) * 1000;
        return annualKWafterHPP;
    }

    public void setAnnualKWafterHPP(int annualKWafterHPP) {
        this.annualKWafterHPP = annualKWafterHPP;
    }

    public int getMoPaymentSolarHPP() {
        double result = 0;
        result = getTotalHP() + getTotalSolar();
        for (int index = 0; index < this.moPaymentYears; index++) {
            result = result * (1 + this.moPaymentPercent / 100);
            System.out.println("result for = " + result);
        }
        if (this.moPaymentYears != 0) {
            result = result / (this.moPaymentYears * 12 * 1.4);
            System.out.println("result if = " + result);
        } else {
            result = getTotalHP() + getTotalSolar();
        }
        return (int) result;
    }

    public void setMoPaymentSolarHPP(int moPaymentSolarHPP) {
        this.moPaymentSolarHPP = moPaymentSolarHPP;
    }

    public double getMoPaymentPercent() {
        return moPaymentPercent;
    }

    public void setMoPaymentPercent(double moPaymentPercent) {
        this.moPaymentPercent = moPaymentPercent;
    }

    public int getMoPaymentYears() {
        return moPaymentYears;
    }

    public void setMoPaymentYears(int moPaymentYears) {
        this.moPaymentYears = moPaymentYears;
    }

    public int getMoPaymentAmount() {
        return moPaymentAmount;
    }

    public void setMoPaymentAmount(int moPaymentAmount) {
        this.moPaymentAmount = moPaymentAmount;
    }

    public int getWantMinEvaluate() {
        return wantMinEvaluate;
    }

    public void setWantMinEvaluate(int wantMinEvaluate) {
        this.wantMinEvaluate = wantMinEvaluate;
    }

    public int getWantMaxEvaluate() {
        return wantMaxEvaluate;
    }

    public void setWantMaxEvaluate(int wantMaxEvaluate) {
        this.wantMaxEvaluate = wantMaxEvaluate;
    }

    public int getSpendKW() {
        if (getIntroduceVehicle() == 1) {
            this.spendKW = getAnnualKWs() + 4000;
        } else {
            this.spendKW = getAnnualKWs();
        }
        return spendKW;
    }

    public void setSpendKW(int spendKW) {
        this.spendKW = spendKW;
    }

    public int getTotalSolar() {
        this.totalSolar = getCostOfSolar() + getAnySolarAdders();
        return totalSolar;
    }

    public void setTotalSolar(int totalSolar) {
        this.totalSolar = totalSolar;
    }

    public String toDashBoardPage(int totalHP) {
        setTotalHP(totalHP);
        return "dashBoard.xhtml";
    }

    public int getCountSolar() {
        System.out.println("getCountSolar = " + (getWantMaxEvaluate() - getWantMinEvaluate()));
        this.countSolar = getWantMaxEvaluate() - getWantMinEvaluate();
        return countSolar;
    }

    public void setCountSolar(int countSolar) {
        this.countSolar = countSolar;
    }

    public int getAnnualKWs() {
        return annualKWs;
    }

    public void setAnnualKWs(int annualKWs) {
        this.annualKWs = annualKWs;
    }

    public String getUtilityDistrict() {
        return utilityDistrict;
    }

    public void setUtilityDistrict(String utilityDistrict) {
        this.utilityDistrict = utilityDistrict;
    }

    public int calculate() {
        return 0;
    }

    public int getIntroduceVehicle() {
        return introduceVehicle;
    }

    public void setIntroduceVehicle(int introduceVehicle) {
        this.introduceVehicle = introduceVehicle;
    }

    public int getEnabledSolar() {
        return enabledSolar;
    }

    public void setEnabledSolar(int enabledSolar) {
        this.enabledSolar = enabledSolar;
    }

    public int getNumberOfPanel() {
        this.numberOfPanel = this.countSolar * 1000 / 270;
        return numberOfPanel;
    }

    public void setNumberOfPanel(int numberOfPanel) {
        this.numberOfPanel = numberOfPanel;
    }

    public int getCostOfSolar() {
        this.costOfSolar = (int) (countSolar * 1000 / 270 * 75.6);
        return costOfSolar;
    }

    public void setCostOfSolar(int costOfSolar) {
        this.costOfSolar = costOfSolar;
    }

    public int getAnySolarAdders() {
        return anySolarAdders;
    }

    public void setAnySolarAdders(int anySolarAdders) {
        this.anySolarAdders = anySolarAdders;
    }

    public int getEnabledHomePerformance() {
        return enabledHomePerformance;
    }

    public void setEnabledHomePerformance(int enabledHomePerformance) {
        this.enabledHomePerformance = enabledHomePerformance;
    }

    public int getGrossHP() {
        return grossHP;
    }

    public void setGrossHP(int grossHP) {
        this.grossHP = grossHP;
    }

    public int getInformation() {
        return information;
    }

    public void setInformation(int information) {
        this.information = information;
    }

    public int getTotalHP() {
        return totalHP;
    }

    public void setTotalHP(int totalHP) {
        this.totalHP = totalHP;
    }

    public int getGrossSolarF() {
        if (getEnabledSolar() == 1) {
            this.grossSolarF = getTotalSolar();
        } else {
            this.grossSolarF = 0;
        }
        return grossSolarF;
    }

    public void setGrossSolarF(int grossSolarF) {
        this.grossSolarF = grossSolarF;
    }

    public int getGrossHPF() {
        if (getEnabledHomePerformance() == 1) {
            this.grossHPF = getTotalHP();
        } else {
            this.grossHPF = 0;
        }
        return grossHPF;
    }

    public void setGrossHPF(int grossHPF) {
        this.grossHPF = grossHPF;
    }

    public int getGrossEV() {
        return grossEV;
    }

    public void setGrossEV(int grossEV) {
        this.grossEV = grossEV;
    }

    public int getGrossProjectCost() {
        this.grossProjectCost = getGrossSolarF() + getGrossHPF();
        return grossProjectCost;
    }

    public void setGrossProjectCost(int grossProjectCost) {
        this.grossProjectCost = grossProjectCost;
    }

    public int getCurrentMoPaymant() {
        if ((getSpendKW() / 12) < 660) {
            this.currentMoPaymant = (int) (getSpendKW() / 12 * 0.1);
        } else {
            this.currentMoPaymant = (int) ((660 * 0.1) + (getSpendKW() / 12 - 660) * 0.19);
        }
        return currentMoPaymant;
    }

    public void setCurrentMoPaymant(int currentMoPaymant) {
        this.currentMoPaymant = currentMoPaymant;
    }

    public int getCostPerKW() {
        return costPerKW;
    }

    public void setCostPerKW(int costPerKW) {
        this.costPerKW = costPerKW;
    }

    //ChartBar
    private HorizontalBarChartModel horizontalBarModel;
    private LineChartModel lineModel;

    @PostConstruct
    public void init() {
        createBarModels();
        createLineModels();
    }

    public HorizontalBarChartModel getHorizontalBarModel() {
        horizontalBarModel = createHorizontalBarModel();
        return horizontalBarModel;
    }

    private void createBarModels() {
        createHorizontalBarModel();
    }

    private HorizontalBarChartModel createHorizontalBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();
        horizontalBarModel.setShadow(true);
        horizontalBarModel.setAnimate(true);
        horizontalBarModel.setLegendRows(1);
        horizontalBarModel.setMouseoverHighlight(true);
        horizontalBarModel.setStacked(true);

        int solarForCarInt = 0;
        if (getIntroduceVehicle() == 1) {
            solarForCarInt = 4;
        } else {
            solarForCarInt = 0;
        }

        ChartSeries lowPrice = new ChartSeries();
        lowPrice.setLabel("10c");
        lowPrice.set(":", 8);

        ChartSeries annualKW = new ChartSeries();
        annualKW.setLabel("19c");
        annualKW.set(":", this.getSpendKW() / 1000 - 8 - solarForCarInt);

        ChartSeries solarForCar = new ChartSeries();
        solarForCar.setLabel("car");
        solarForCar.set(":", solarForCarInt);

        horizontalBarModel.addSeries(lowPrice);
        horizontalBarModel.addSeries(annualKW);
        horizontalBarModel.addSeries(solarForCar);

//        horizontalBarModel.setTitle("Model");
        horizontalBarModel.setLegendPosition("e");
        horizontalBarModel.setStacked(true);

        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
//        xAxis.setLabel("Births");
        xAxis.setMin(0);
        xAxis.setMax(this.getSpendKW() / 600);

        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
//        yAxis.setMax(5);

        return horizontalBarModel;
    }

    public LineChartModel getLineModel() {
        createLineModels();
        return lineModel;
    }

    private void createLineModels() {
        lineModel = initLinearModel();
        lineModel.setTitle("Linear Chart");
        lineModel.setLegendPosition("e");
        lineModel.setShowPointLabels(true);
        lineModel.getAxes().put(AxisType.X, new CategoryAxis("Years"));
        Axis yAxis = lineModel.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(this.currentMoPaymant * 1.2);
    }

    private LineChartModel initLinearModel() {

        fillingLineChart();

        LineChartModel model = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("as is");

        series1.set(series1_string0_column1, series1_string0_column2);
        series1.set(series1_string1_column1, series1_string1_column2);
        series1.set(series1_string2_column1, series1_string2_column2);
        series1.set(series1_string3_column1, series1_string3_column2);
        series1.set(series1_string4_column1, series1_string4_column2);
        series1.set(series1_string5_column1, series1_string5_column2);

        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("to be");

        series2.set(series1_string0_column1, series2_string0_column2);
        series2.set(series1_string1_column1, series2_string1_column2);
        series2.set(series1_string2_column1, series2_string2_column2);
        series2.set(series1_string3_column1, series2_string3_column2);
        series2.set(series1_string4_column1, series2_string4_column2);
        series2.set(series1_string5_column1, series2_string5_column2);

        model.addSeries(series1);
        model.addSeries(series2);

        return model;
    }

    public void fillingLineChart() {
        int year = Calendar.getInstance().get(Calendar.YEAR);

        series1_string0_column1 = year;
        series1_string0_column2 = getCurrentMoPaymant();
        series1_string1_column1 = year + this.moPaymentYears / 5;
        series1_string1_column2 = getCurrentMoPaymant() * Math.pow(1.0035, this.moPaymentYears / 5);
        series1_string2_column1 = year + (this.moPaymentYears / 5) * 2;
        series1_string2_column2 = getCurrentMoPaymant() * Math.pow(1.0035, 2 * this.moPaymentYears / 5);
        series1_string3_column1 = year + (this.moPaymentYears / 5) * 3;
        series1_string3_column2 = getCurrentMoPaymant() * Math.pow(1.0035, 3 * this.moPaymentYears / 5);
        series1_string4_column1 = year + (this.moPaymentYears / 5) * 4;
        series1_string4_column2 = getCurrentMoPaymant() * Math.pow(1.0035, 4 * this.moPaymentYears / 5);
        series1_string5_column1 = year + (this.moPaymentYears / 5) * 5;
        series1_string5_column2 = getCurrentMoPaymant() * Math.pow(1.0035, 5 * this.moPaymentYears / 5);

        series2_string0_column2 = this.getMoPaymentToCompany() + this.getMoPaymentSolarHPP();
        series2_string1_column2 = this.getMoPaymentToCompany() * 1.0035 + this.getMoPaymentSolarHPP();
        series2_string2_column2 = this.getMoPaymentToCompany() * Math.pow(1.0035, 2) + this.getMoPaymentSolarHPP();
        series2_string3_column2 = this.getMoPaymentToCompany() * Math.pow(1.0035, 3) + this.getMoPaymentSolarHPP();
        series2_string4_column2 = this.getMoPaymentToCompany() * Math.pow(1.0035, 4) + this.getMoPaymentSolarHPP();
        series2_string5_column2 = this.getMoPaymentToCompany() * Math.pow(1.0035, 5) + this.getMoPaymentSolarHPP();

    }

}
