package games.phoenix.enemies;

import java.io.File;

import org.newdawn.slick.SlickException;

import app.AppLoader;
import games.phoenix.Player;
import games.phoenix.World;
import games.phoenix.enemies.Enemy.EnemyColor;

public class EnemyRed extends Enemy{
	
	public EnemyRed(int x, int y) throws SlickException
	{
		super(0, "red", x, y, EnemyColor.RED);
	}
	
	/*
	 * Fonction qui doit disparaitre à terme: c'est pour faire des test à l'arrache sur le
	 * bon fonctionnement de l'ennemis
	 */
	public void init(Enemy enemy, Player player) 
	{
		setBehavior(new EnemyBehavior(enemy, player));
		getBehavior().setPlayerInfluence(EnemyBehavior.interacting.COMING);
	}
}
