package com.creatosoft.playermanagement.service;

import java.io.IOException;

public interface World {

	public void addPlayer() throws IOException;
	public void viewPlayer() throws IOException;
	public void viewScore() throws IOException ;
	public void updateScore() throws IOException;
}
