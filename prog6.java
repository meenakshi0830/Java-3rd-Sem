import java.util.Scanner;
public class prog6 {
    public static void main(String args[]){
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        int total[] = new int[5];
        System.out.println("Enter number of students");
        n = sc.nextInt();
        CIE.student[] s = new CIE.student[n];
        CIE.internal[] ci = new CIE.internal[n];
        SEE.externals[] se = new SEE.externals[n];
        for(i=0;i<n;i++){
            System.out.println("Enter student details of student " + (i+1));
            s[i] = new CIE.student();
            s[i].accept();
            ci[i] = new CIE.internal();
            ci[i].accept();
            se[i] = new SEE.externals();
            se[i].accept();
        }
        for(i=0;i<n;i++){
            System.out.println("Details of student " +(i+1));
            s[i].display();
            for(j=0;j<5;j++){
                total[i] = ci[j].ciem[j] + se[j].seem[j];
                System.out.println("Total marks in subject " +(j+1) + total[j]);
            }
            System.out.println();
        }
        sc.close();

    }
}
