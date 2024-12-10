package WSPBackFinal;
public class Marks {
    private double firstAttestation;
    private double secondAttestation;
    private double finalExam;

    public Marks(){
        this.firstAttestation = 0;
        this.secondAttestation = 0;
        this.finalExam = 0;
    }

    public void addMark(double mark, int week){
        if (week <= 7){
            firstAttestation = firstAttestation + mark;
        } else if (week <= 15) {
            secondAttestation = secondAttestation + mark;
        }
    }

    public double getFirstAttestation() {
        return firstAttestation;
    }

    public double getSecondAttestation() {
        return secondAttestation;
    }

    public double getFinalExam() {
        return finalExam;
    }
    public void setFinalExam(double finalExam){
        this.finalExam = finalExam;
    }

    public double totalMarksForAttestation(){
        return firstAttestation + secondAttestation;
    }
    public boolean isRetake(){
        return totalMarksForAttestation() < 30;
    }
    public double totalMarksForAll(){
        return firstAttestation + secondAttestation + finalExam;
    }
    @Override
    public String toString() {
        return "Marks: First Attestation = " + firstAttestation + ", Second Attestation = " + secondAttestation + ", Total = " + totalMarksForAttestation();
    }
}
