Feature:  Fizz or Buzz?
  Let's play!

  Scenario Outline: The number is divisible by 3 or 5 or 3 and 5
    Given The number is <number>
    When  I check if number is divisible
    Then  Answer is <answer>
    Examples:
      | number | answer |
      | 2 | "None" |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 18 | "Fizz" |
      | 20 | "Buzz" |
      | 22  | "None" |
      | 60  | "FizzBuzz" |
