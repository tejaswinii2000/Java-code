package TrainTicket;
import java.util.Scanner;

class InvalidPasswordException extends Exception {
    int passwordConditionViolated = 0;

	public InvalidPasswordException(int passwordConditionViolated) {
		super("Invalid Password: ");
		this.passwordConditionViolated = passwordConditionViolated;
	}

	public String printMessage()
	{
        // Using switch statement to allocate the errors when User enters the password
		switch (passwordConditionViolated) {

		case 1:
			return ("Password length should be between 6 to 10 characters");

		case 2:
			return ("Password should not contain any space");

		case 3:
			return ("Password should contain at least one digit(0-9)");

		case 4:
			return ("Password should contain at least one special character");

		case 5:
			return ("Password should contain at  least one uppercase letter(A-Z)");

		case 6:
			return ("Password should contain at least one lowercase letter(a-z)");
		}

		return ("");
	}
}
