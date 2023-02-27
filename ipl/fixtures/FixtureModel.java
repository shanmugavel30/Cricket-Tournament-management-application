package com.ipl.fixtures;

import java.util.ArrayList;
import java.util.List;

import com.ipl.pojos.Fixtures;
import com.ipl.repository.IplRepository;

public class FixtureModel implements ControllerToModel{
	private ModelToController fixturecontroller;
	
	public FixtureModel(FixtureController fixturecontroller) {
		this.fixturecontroller=  fixturecontroller;
	}

	public void getFixtures() {
		List<Fixtures>allfixtures=new ArrayList<>();
		allfixtures=IplRepository.getInstance().getFixtures();
		fixturecontroller.foundFixtures(allfixtures);
	}
}
