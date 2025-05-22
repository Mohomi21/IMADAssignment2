# IMADAssignment2
# Let's Study - Quiz Application

## Overview
Let's Study is a simple Android application designed to test users' knowledge of South African history through a True/False quiz. The app consists of three main screens:
1. **Welcome Screen**: A button to start the quiz.
2. **Quiz Screen**: Displays six True/False questions.
3. **Results Screen**: Displays the user's score and provides an option to restart the quiz.

## Features
- Navigate between screens using buttons.
- Answer six True/False questions about South African history.
- View the total score on the results screen.
- Restart the quiz from the results screen.

## Screens
### 1. Welcome Screen
- Displays a welcome message.
- Includes a "Next" button to navigate to the quiz screen.

### 2. Quiz Screen
- Displays one question at a time.
- Two buttons ("True" and "False") to answer the question.
- Automatically moves to the next question after an answer is selected.
- Calculates the total score based on correct answers.

### 3. Results Screen
- Displays the user's score in the format: `Your Score: X/Y`.
- Includes a "Restart" button to restart the quiz.

## How It Works
1. **Navigation**: 
   - The "Next" button on the welcome screen navigates to the quiz screen.
   - After answering all questions, the app navigates to the results screen.
   - The "Restart" button on the results screen navigates back to the welcome screen.

2. **Quiz Logic**:
   - Questions and answers are stored in a list.
   - The app checks the user's answer and updates the score.
   - At the end of the quiz, the score is passed to the results screen.

3. **Results**:
   - The results screen retrieves the score and total questions from the quiz screen and displays them in a `TextView`.

## Future Improvements
- Add more questions to the quiz.
- Include a timer for each question.
- Add a leaderboard to track high scores.

## Link to repository 

