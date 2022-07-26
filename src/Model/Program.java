package Model;

public abstract class Program {

    private String programCode;
    private String programName;
    private String programType;

    public Program(String programCode,String programName,String programType){
        this.programCode = programCode;
        this.programName = programName;
        this.programType = programType;
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

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }
}
