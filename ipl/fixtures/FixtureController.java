package com.ipl.fixtures;

import java.util.List;

import com.ipl.pojos.Fixtures;

public class FixtureController implements ModelToController,ViewToController{
	private ControllerToModel fixturemodel;
	private ControllerToView fixtureview;
	
	public FixtureController(FixtureView fixtureview) {
		this.fixtureview=fixtureview;
		fixturemodel= new FixtureModel(this);
	}

	public void getFixtures() {
		fixturemodel.getFixtures();
	}

	public void foundFixtures(List<Fixtures> allfixtures) {
		fixtureview.foundFixtures(allfixtures);
		
	}

}
