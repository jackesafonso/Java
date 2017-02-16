package com.fdmgroup.pensions.task3;

public class PensionController {

	public void handlePensions(Person[] people) {

		int counter = 0;
		for (counter = 0; counter < people.length; counter++) {

			Person individualPerson = people[counter];
			String dbo = individualPerson.getDateOfBirth();
			// index 6 in order to get the year of birth example 17/25/1945
			// it gets the year of birth and anything after the year
			String year = dbo.substring(6);

			PensionLogic logic = new PensionLogic();
			boolean isPensionable = logic.isPensionable(individualPerson, year);

			View view = new View();

			if (isPensionable == true) {

				view.printEligible(individualPerson);
			} else {
				view.printIneligible(individualPerson);
			}

		}
	}

}
