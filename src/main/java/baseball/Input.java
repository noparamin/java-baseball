package baseball;


import camp.nextstep.edu.missionutils.Console;

import java.util.HashSet;
import java.util.Set;

public class Input {
    public static final int NUMBER_SIZE = 3;

    public String inputUserNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String userInputNumber = Console.readLine();

        return userInputNumber;
    }

    public boolean isNumberSizeThree(String userNumber) {
        return userNumber.length() == NUMBER_SIZE;
    }

    public boolean isNumberDifferent(String userNumber) {
        Set<Character> numbers = new HashSet<>();

        for(char number : userNumber.toCharArray()) {
            numbers.add(number);
        }

        return userNumber.length() == numbers.size();
    }

    public boolean isNumberRangeValid(String userNumber) {
        for(int index = 0; index < userNumber.length(); index++) {
            if(userNumber.charAt(index) < '1' || userNumber.charAt(index) > '9') {
                return false;
            }
        }
        return true;
    }

    public boolean isNumber(String userNumber) {
        for(int index = 0; index < userNumber.length(); index++) {
            char number = userNumber.charAt(index);
            if(!Character.isDigit(number)) {
                return false;
            }
        }
        return true;
    }

    public void inputUserNumberValid(String userNumber) {
        if(isNumberSizeThree(userNumber) && isNumberDifferent(userNumber)) {
            return;
        }
        if(isNumberRangeValid(userNumber) && isNumber(userNumber)) {
            return;
        }
        throw new IllegalArgumentException("잘못된 값을 입력했습니다. 게임을 종료합니다.");
    }

}
