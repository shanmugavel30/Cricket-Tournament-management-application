package com.ipl.pointstable;

import java.util.ArrayList;
import java.util.List;

import com.ipl.pojos.Points;
import com.ipl.repository.IplRepository;

public class PointsTableModel implements ControllerToModel{
	private ModelToController pointscontroller;
	
	public PointsTableModel(PointsTableController pointscontroller) {
		this.pointscontroller= pointscontroller;
	}

	public void getPointsTable() {
		List<Points> currentPointsTable= new ArrayList<>();
		currentPointsTable=IplRepository.getInstance().getPointsTable();
		pointscontroller.foundPointsTable(currentPointsTable);
	}
}
