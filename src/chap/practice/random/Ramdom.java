package chap.practice.random;

public class Ramdom {
    public static void main(String[] args) {

        int a = (int) (Math.random() * 6) + 1;
        int b = (int) (Math.random() * 6) + 1;
        int c = (int) (Math.random() * 6) + 1;


        System.out.println("주사위를 던집니다!");
        System.out.println("첫번쨰 주사위는 " + a + "입니다.");
        System.out.println("주사위를 던집니다!");
        System.out.println("첫번쨰 주사위는 " + b + "입니다.");
        System.out.println("주사위를 던집니다!");
        System.out.println("첫번쨰 주사위는 " + c + "입니다.");

        if (a == b && b == c) {
            System.out.println("상금은 " + (10000 + a * 1000) + "원 입니다."
            );

        } else if (a == b || b == c || a == c) {
            System.out.println("상금은 " + (1000 + b * 100) + "원 입니다."
            );
        }else if (a > b && a > c) {System.out.println("상금은 " + (a * 100) + "원 입니다.");
        }else if (b > c) {System.out.println("상금은 " + (b * 100) + "원 입니다.");
        }else { System.out.println("상금은 " + (c * 100) + "원 입니다.");
                    }

                }


            }





