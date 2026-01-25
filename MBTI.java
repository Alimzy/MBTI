import java.util.Scanner;
import java.util.Arrays;
public class MBTI{
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
       
        
        char[] extrovertedVsIntroverted = new char[5];
        char[] sensingVsIntuitive = new char[5];
        char[] thinkingVsFeeling = new char[5];
        char[] judgingVsPerceptive = new char[5];

        String[][] questions = {{"A. expand energy, enjoy groups","B. conserve energy, enjoy one-on-one"},
                            {"A. Interpret literally", "B. Look for meaning and possibilities"},
                            {"A. Logical thinking, questioning", "B. Empathetic, feeling, accommodating"},
                            {"A. Organized, orderly", "B. flexible, adaptable"},
                            {"A. More outgoing, Think out loud","B More reserved, think of yourself"},
                            {"A. Practical, realistic, experimental ","B imaginative, innovative, theretical"},
                            {"A. Candid, straight forward, frank ","B tactful, Kind, encouraging "},
                            {"A. Plan, Scheduled","B unplanned, spomtaneous"},
                            {"A. seek many task, public activities, interaction with others","B seek private, solitary activies with quiet to concentrate"},
                            {"A. Standard, usual, coventional","B different, novel, unique"},
                            {"A. firm, tend to criticize, hold the line","B gentle, tend to appreciate, conciliate "},
                            {"A. regulated, structured","B easy going, live and let live"},
                            {"A. External, communicative, express yourself ","B internal, reticent, keep to yourself"},
                            {"A. focus on here-and-now","B look to the future, global perspective, big picture"},
                            {"A. Tough-minded, just","B tender-hearted, merciful"},
                            {"A. Preparation, plan ahead","B go with the flow, adapt as you go"},
                            {"A. Active, initiate ","B reflective, deliberate"},
                            {"A. Facts, things, what is","B Ideas, dreams, what could be, philosophical"},
                            {"A. matter of fact, issue-oriented ","B Sensitive, people-oriented, compassionate"},
                            {"A. control, govern", "B. latitude, freedom"}


                        };
        System.out.println("Welcome to Alimzy's personality Test");
        
          char[] answers = new char[questions.length];

        for(int number = 0; number < questions.length; number++){
            System.out.println("Enter which of the options applies to you ");
           
                System.out.println((number + 1) + ". "+ Arrays.toString(questions[number]));
               
                System.out.println("Select options:");
                answers[number] = input.next().charAt(0);

                              
            
        }
       System.out.println(answers);

       for(int number = 0; number < questions.length; number++){
            getExrovertedVsIntroverted(answers);
            getSensingVsIntuitive(answers);
            getThinkingVsFeeling(answer);
            getjudgingVsPercetive(answer);
       }
    }


    public static char[]  getExrovertedVsIntroverted(char[] answers){
        int count = 0;
        char[] storeEI = new char[5];
        for(int number = 0; number < 20; number++){
             if(number == 0 || number == 4 || number == 8 || number == 12 || number == 16 ){
                storeEI[count] = answers;
                count++;
            }          
        }
        return storeEI;
    }   

    public static char[]  getSensingVsIntuitive(char[] answers){
        int count = 0;
        char[] storeSI = new char[5];
        for(int number = 0; number < 20; number++){        
             if(number == 1 || number == 5 || number == 9 || number == 13 || number == 17 ){
                storeSI[count] = answers;
                count++;
            }
        }
        return storeSI;
    }   
    
    public static char[]  getThinkingVsFeeling(char[] answer){
        int count = 0;
        char[] storeTF = new char[5];
        for(int number = 0; number < 20; number++){
             if(number == 2 || number == 6 || number == 10 || number == 14 || number == 18 ){
                storeTF[count] = answers;
                count++;
            }
        }
        return storeTF;
    }   

    public static char[]  getjudgingVsPerceptive(char[] answer){
        int count = 0;
        char[] storeJP = new char[5];
        for(int number = 0; number < 20; number++){
             if(number == 3 || number == 7 || number == 11 || number == 15 || number == 19 ){
                storeJP[count] = answers;
                count++;
            }
        }
        return storeJP;
    }   

}
