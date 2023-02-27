package com.ipl.play;

import java.util.ArrayList;
import java.util.List;

import com.ipl.repository.IplRepository;

public class PlayModel implements ControllerToModel{
	private  ModelToController playcontroller;
	
	public PlayModel(PlayController playcontroller) {
		this.playcontroller= playcontroller;
	}

	public void changePointsTable(String win1) {
		IplRepository.getInstance().changePointsTable(win1);
	}
	public void changePosition() {
		IplRepository.getInstance().changePosition();
	}

	public void getsemiTeams() {
		List<String> semiteams=new ArrayList<>();
		semiteams=IplRepository.getInstance().getsemiTeams();
		playcontroller.foundSemiteams(semiteams);
	}
}
