/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Michael
 */
public class Article {

    private String stateCode;
    private String stateName;
    private String programCode;
    private String programName;
    private String articleNumber;
    private String articleSite;
    private String pathway;
    private String licenseType;


    public Article(String stateCode, String stateName, String programCode, String programName, String licenseType, String articleNumber, String articleSite, String pathway){
        this.stateCode = stateCode;
        this.stateName = stateName;
        this.programCode = programCode;
        this.programName = programName;
        this.articleNumber = articleNumber;
        this.articleSite = articleSite;
        this.pathway = pathway;
        this.licenseType = licenseType;


    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public String getArticleSite() {
        return articleSite;
    }

    public void setArticleSite(String articleSite) {
        this.articleSite = articleSite;
    }

    public String getPathway() {
        return pathway;
    }

    public void setPathway(String pathway) {
        this.pathway = pathway;
    }






}
