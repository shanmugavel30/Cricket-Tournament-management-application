package com.ipl.teams;

import java.util.List;

public class TeamController implements ModelToController,ViewToController{
	private ControllerToView teamview;
	private ControllerToModel teammodel;
	
	public TeamController(TeamView teamview) {
		this.teamview=teamview;
		teammodel=new TeamModel(this);
	}

	public void getPlayers(int opt) {
		teammodel.getPlayers(opt);
	}

	public void foundPlayers(List<String> players) {
		teamview.foundPlayers(players);
	}
}
