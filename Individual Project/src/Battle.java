
public class Battle {

		private String playerMove;
		private String npcMove;
		private int playerDamage;
		private int npcDamage;
		private String result;
		private int playerHealthChange;
		private int npcHealthChange;
		
		public Battle (String pM, String nM, int pD, int nD,String r, int phc, int nhc) {
			playerMove = pM;
			npcMove = nM;
			playerDamage = pD;
			npcDamage = nD;
			result = r;
			playerHealthChange = phc;
			npcHealthChange = nhc;
		}

		public String getPlayerMove() {
			return playerMove;
		}

		public void setPlayerMove(String playerMove) {
			this.playerMove = playerMove;
		}

		public String getNpcMove() {
			return npcMove;
		}

		public void setNpcMove(String npcMove) {
			this.npcMove = npcMove;
		}

		public int getPlayerDamage() {
			return playerDamage;
		}

		public void setPlayerDamage(int playerDamage) {
			this.playerDamage = playerDamage;
		}

		public int getNpcDamage() {
			return npcDamage;
		}

		public void setNpcDamage(int npcDamage) {
			this.npcDamage = npcDamage;
		}

		public String getResult()
			{
				return result;
			}

		public void setResult(String result)
			{
				this.result = result;
			}

		public int getPlayerHealthChange() {
			return playerHealthChange;
		}

		public void setPlayerHealthChange(int playerHealthChange) {
			this.playerHealthChange = playerHealthChange;
		}

		public int getNpcHealthChange() {
			return npcHealthChange;
		}

		public void setNpcHealthChange(int npcHealthChange) {
			this.npcHealthChange = npcHealthChange;
		}
		
}
