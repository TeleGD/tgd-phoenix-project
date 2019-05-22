package games.phoenix.enemies;

import java.io.File;

import org.newdawn.slick.SlickException;

import app.AppLoader;
import games.phoenix.Player;
import games.phoenix.World;
import games.phoenix.enemies.Enemy.EnemyColor;

public class EnemyGreen extends Enemy{
	
	public EnemyGreen(int x, int y, Player player) throws SlickException
	{
		super(0, "green", x, y, EnemyColor.GREEN);
		setBehavior(new EnemyBehavior(this, player));
		getBehavior().setPlayerInfluence(EnemyBehavior.interacting.COMING);
	}
	
	/*
	 * Fonction qui doit disparaitre à terme: c'est pour faire des test à l'arrache sur le
	 * bon fonctionnement de l'ennemis
	 */
	public void init(Enemy enemy, Player player) 
	{
		
	}
}
