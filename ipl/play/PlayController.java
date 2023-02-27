package com.ipl.play;

import java.util.List;

public class PlayController implements ModelToController,ViewToController{
	private ControllerToView playview;
	private ControllerToModel playmodel;
	
	public PlayController(PlayView playview) {
		this.playview= playview;
		playmodel=new PlayModel(this);
	}

	public void changePointsTable(String win1) {
		playmodel.changePointsTable(win1);
	}

	public void changePosition() {
		playmodel.changePosition();
	}

	public void getsemiTeams() {
		playmodel.getsemiTeams();
	}

	public void foundSemiteams(List<String> semiteams) {
		playview.foundSemiteams(semiteams);
	}
	
}
