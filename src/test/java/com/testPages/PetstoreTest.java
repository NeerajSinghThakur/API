package com.testPages;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.Random;

import org.codehaus.plexus.util.ExceptionUtils;
import org.testng.annotations.Test;
import utilities.Log;
import utilities.TestBase;
import pages.PetStoreFunctions;

public class PetstoreTest extends TestBase {

	Random r = new Random();
	int petId = r.nextInt(100) + 1;
	
	@Test(enabled = true, priority = 1)
	public void validateAddPetTest() {

		try {
			PetStoreFunctions.validateAddPet();

		} catch (Exception | AssertionError e) {
			Assert.fail("Add pet scenario has failed" + ExceptionUtils.getFullStackTrace(e));
		}

	}

	@Test(enabled = true, priority = 2)
	public void validateUpdatePetTest() {

		try {
			PetStoreFunctions.validateUpdatePet(20);

		} catch (Exception | AssertionError e) {
			Assert.fail("Update pet scenario has failed" + ExceptionUtils.getFullStackTrace(e));
		}
	}

	@Test(enabled = true, priority = 3)
	public void validateGetPetTest() {
		try {
			System.out.println("Random Number :" +petId);
			PetStoreFunctions.validateGetPet(20);

		} catch (Exception | AssertionError e) {
			Assert.fail("Get pet scenario has failed" + ExceptionUtils.getFullStackTrace(e));
		}
	}

	@Test(enabled = true, priority = 4)
	public void validateDeletePetTest() {
		try {
			PetStoreFunctions.validateDeletePet(20);

		} catch (Exception | AssertionError e) {
			Assert.fail("Delete pet scenario has failed" + ExceptionUtils.getFullStackTrace(e));
		}
	}

}
