package com.ipl.teams;

import java.util.ArrayList;
import java.util.List;

import com.ipl.repository.IplRepository;

public class TeamModel implements ControllerToModel{
	private ModelToController teamcontroller;
	
	public TeamModel(TeamController teamcontroller) {
		this.teamcontroller=teamcontroller;
	}

	public void getPlayers(int opt) {
		List<String> players=new ArrayList<>();
		players=IplRepository.getInstance().getPlayers(opt);
		teamcontroller.foundPlayers(players);
	}
}
