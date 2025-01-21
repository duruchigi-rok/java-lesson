package basic;

public class Operators {
    // Entry Point (프로그램 진입점)
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        // 연산자
        // 1. 산술 연산자 : +, -, *, /, %(나머지), ++(1씩 증가), --(1씩 감소)
        // 2. 대입 연산자 : =, +=, -=, *=, /=, %=
        // 3. 관계 연산자(비교 연산자)
        // 4. 논리 연산자
        // 5. 비트 연산자
        // 6. 기타 연산자
        num1 = 10;
        num2 = 3;
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        num3 = num1 + num2;
        System.out.println("num1 + num2 = " + num3);

        num3 = num1 - num2;
        System.out.println("num1 - num2 = " + num3);

        num3 = num1 * num2;
        System.out.println("num1 * num2 = " + num3);

        num3 = num1 / num2;
        System.out.println("num1 / num2 = " + num3); // 정수와 정수의 연산값은 무조선 정수

        num3 = num1 % num2;
        System.out.println("num1 % num2 = " + num3);

        // 실수형 변수를 선언
        float fNum;
        fNum = num1 / (float)num2;  // 형변환 (Type Casting)
        System.out.println("num1 / num2 = " + fNum);

        // num1 = num1 + 1;
        
        // 증감연산자 : ++, --
        System.out.printf("num1 : %d\n", num1);
        System.out.printf("num1 : %d\n", num1++);   // post fix : 같은 줄에 사용된 명령을 먼저 실행하고 난 뒤 증가
        System.out.printf("num1 : %d\n", num1++);
        System.out.printf("num1 : %d\n", ++num1);   // pre - fix : 변수의 값을 먼저 증가한 뒤 같은 줄에 있는 명령을 실행

        // 2. 대입 연산자 : =, +=, -=, *=, /=, %=
        num3 += num1;   // num3 = num3 + num1;
        num3 -= num1;   // num3 = num3 - num1;
        num3 *= num1;   // num3 = num3 * num1;
        num3 /= num1;   // num3 = num3 / num1;
        num3 %= num1;   // num3 = num3 % num1;

        // 형변환
        short shNum = (short)num1;  // 명시적 형변환, overflow가 발생할 수 있고 그 책임은 개발자에게 있다.
        num1 = shNum;   // 묵시적 형변환

        // 3. 관계(비교) 연산자 : >, <, >=, <=, ==, !=
        num1 = 10;
        num2 = 5;
        boolean b0k = num1 > num2;
        System.out.println("num1 > num2 : " + b0k);

        b0k = !(num1 < num2);
        System.out.println("num1 < num2 : " + b0k);

        b0k = num1 == num2; // 둘이 같냐
        System.out.println("num1 == num2 : " + b0k);

        b0k = num1 != num2; // 둘이 다르냐
        System.out.println("num1 != num2 : " + b0k);

        // 4. 논리 연산자 : &&(AND), ||(OR), !(NOT)
        b0k = num1 > num2 && num1 == num2;
        System.out.println("b0k : " + b0k);

        b0k = num1 < num2 || num1 != num2;
        System.out.println("b0k : " + b0k);

        // 5. 비트 연산자 : &(and), |(or), ~(not), ^(xor), <<, >>(shift) //비트는 0000 0000
        num1 = 5;
        num2 = 3;
        num3 = num1 & num2;
        System.out.println("num3 : " + num3);
        num3 = num1 | num2;
        System.out.println("num3 : " + num3);
        num3 = ~num1;
        System.out.println("num3 : " + num3);
        // xor : 두 개의 비트가 같으면 0, 다르면 1로 세팅된다.
        num3 = num1 ^ num2;
        System.out.println("num3 : " + num3);
        // shift 연산
        num3 = num1 << 1;   // num1의 비트를 왼쪽으로 한칸 이동시킴
        System.out.println("num3 : " + num3);
        num3 = num1 >> 1;   // num1의 비트를 오른쪽으로 한칸 이동시킴
        System.out.println("num3 : " + num3);

        // 6. 기타 연산자 : +, (조건식) ? 참일 때 값 : 거짓일 때 값 -> 상황 연산자
        //sout에서 +(더하기)는 객체와 객체를 잇는 것으로 연산과 별개
        num3 = (num1==5) ? 1 : 0;
            
    }

}
