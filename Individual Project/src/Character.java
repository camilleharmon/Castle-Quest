
public class Character
	{
				
			private String name;
			private boolean sword;
			private int hitpoints;
			private int level;
			
			public Character(String n, boolean s, int HP, int l) {
				name = n;
				sword = s;
				hitpoints = HP;
				level = l;
			}

			public String getName()
				{
					return name;
				}

			public void setName(String name)
				{
					this.name = name;
				}

			public boolean isSword()
				{
					return sword;
				}

			public void setSword(boolean sword)
				{
					this.sword = sword;
				}

			public int getHitpoints()
				{
					return hitpoints;
				}

			public void setHitpoints(int hitpoints)
				{
					this.hitpoints = hitpoints;
				}

			public int getLevel()
				{
					return level;
				}

			public void setLevel(int level)
				{
					this.level = level;
				}
			
			

	}
