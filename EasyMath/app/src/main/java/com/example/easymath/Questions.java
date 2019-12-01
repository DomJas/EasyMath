package com.example.easymath;

import java.util.Random;

public class Questions {

    private int firstNumber;
    private int secondNumber;
    private int answer;

    public int answer() {
        return answer;
    }

    public void setId(int answer) {
        this.answer = answer;
    }

    public String getIdStr() {
        return Integer.toString(answer);
    }

    public void setId(String answer) throws NumberFormatException {
        this.answer = Integer.parseInt(answer);
    }

    //there are four possible choices for the user to pick from
    private int [] answerArray;

    //which of the four positions is correct 0, 1, 2, or 3
    private int answerPosition;

    // the maximum value of firstNumber or secondNumber
    private int upperLimit;

    //string output of the problem e.g. "4 x 9 ="
    private String questionPhrase;

    //generate a new random question
    public Questions(int upperLimit, int gameType) {
        this.upperLimit = upperLimit;
        Random randomNumberMaker = new Random();

        this.firstNumber = randomNumberMaker.nextInt(upperLimit);
        this.secondNumber = randomNumberMaker.nextInt(upperLimit);

        //inside the care whole switch statement will be inside these two
        if (gameType==Constants.MULTIPLICATION_GAME_TYPE) {
            this.answer = this.firstNumber * this.secondNumber;
            this.questionPhrase = firstNumber + " " + "x" + " " + secondNumber;
        }

        if (gameType==Constants.DIVISON_GAME_TYPE) {
            this.answer = this.firstNumber / this.secondNumber;
            this.questionPhrase = firstNumber + " " + "/" + " " + secondNumber;
        }
        if (gameType==Constants.ADDITION_GAME_TYPE) {
            this.answer = this.firstNumber + this.secondNumber;
            this.questionPhrase = firstNumber + " " + "+" + " " + secondNumber;
        }
        if (gameType==Constants.SUBTRACTION_GAME_TYPE) {
            this.answer = this.firstNumber - this.secondNumber;
            this.questionPhrase = firstNumber + " " + "-" + " " + secondNumber;
        }


        this.answerPosition = randomNumberMaker.nextInt( 4);
        this.answerArray = new int [] {0,1,2,3};

        this.answerArray[0] = answer + 1;
        this.answerArray[1] = answer + 10;
        this.answerArray[2] = answer - 5;
        this.answerArray[3] = answer - 2;

        this.answerArray = shuffleArray(this.answerArray);

        answerArray[answerPosition] = answer;
    }

    private int [] shuffleArray(int[] array) {
        int index, temp;
        Random randomNumberGenerator = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            index = randomNumberGenerator.nextInt( i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

        return array;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int[] getAnswerArray() {
        return answerArray;
    }

    public void setAnswerArray(int[] answerArray) {
        this.answerArray = answerArray;
    }

    public int getAnswerPosition() {
        return answerPosition;
    }

    public void setAnswerPosition(int answerPosition) {
        this.answerPosition = answerPosition;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getQuestionPhrase() {
        return questionPhrase;
    }

    public void setQuestionPhrase(String questionPhrase) {
        this.questionPhrase = questionPhrase;
    }
}
