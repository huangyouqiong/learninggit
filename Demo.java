
public class Demo {

	public static void main(String[] args) {
		SchoolSystem schoolSystem = new SchoolSystem(1, 1, 0);
        int[][] arr = {{1,1,0},{1},{2},{3},{1}};
        schoolSystem.print(arr);


	}

}
class SchoolSystem {
    private int big;
    private int medium;
    private int small;

    public int getBig() {
        return big;
    }

    public int getMedium() {
        return medium;
    }


    public int getSmall() {
        return small;
    }

    public SchoolSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addStudent(int stuType) {
        int tempValue;
        if (stuType == 1) {
            tempValue = this.getBig();
            if(tempValue == 0 ){
                return false;
            }else{
                this.big = tempValue - 1;
                return true;
            }

        }

        if (stuType == 2) {
            tempValue = this.getMedium();
            if(tempValue == 0 ){
                return false;
            }else{
                this.medium = tempValue - 1;
                return true;
            }

        }

        if (stuType == 3) {
            tempValue = this.getSmall();
            if(tempValue == 0 ){
                return false;
            }else{
                this.small = tempValue - 1;
                return true;
            }

        }

        return false;
    }

    public String[] parse(int[][] input){
        String temp;

        String[] result = new String[5];

        result[0] = "null";

        temp = String.valueOf(this.addStudent(input[0][1]));
        result[1] = temp;

        temp = String.valueOf(this.addStudent(input[2][0]));
        result[2] = temp;

        temp = String.valueOf(this.addStudent(input[3][0]));
        result[3] = temp;

        temp = String.valueOf(this.addStudent(input[4][0]));
        result[4] = temp;

        return result;
    }

    public void print(int[][] input) {
        String[] result = this.parse(input);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

    }

}
