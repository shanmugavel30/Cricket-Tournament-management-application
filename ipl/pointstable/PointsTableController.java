package com.ipl.pointstable;

import java.util.List;

import com.ipl.pojos.Points;

public class PointsTableController implements ModelToController,ViewToController{
	private ControllerToView pointsview;
	private ControllerToModel pointsmodel;
	
	public PointsTableController(PointsTableView pointsview) {
		this.pointsview=pointsview;
		pointsmodel=new PointsTableModel(this);
	}

	public void getPointTable() {
		pointsmodel.getPointsTable();
	}

	public void foundPointsTable(List<Points> currentPointsTable) {
		pointsview.foundPointsTable(currentPointsTable);
	}
	
}
