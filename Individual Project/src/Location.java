
public class Location
	{
		private String name;
		private String description;
		private String initialChoice;
		private String optionalChoiceO;
		private String optionalChoiceT;
		
		public Location (String n, String d, String ic, String oc, String occ) {
			name = n;
			description = d;
			initialChoice = ic;
			optionalChoiceO = oc;
			optionalChoiceT = occ;
			
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getDescription()
			{
				return description;
			}

		public void setDescription(String description)
			{
				this.description = description;
			}

		public String getInitialChoice()
			{
				return initialChoice;
			}

		public void setInitialChoice(String initialChoice)
			{
				this.initialChoice = initialChoice;
			}

		public String getOptionalChoiceO()
			{
				return optionalChoiceO;
			}

		public void setOptionalChoiceO(String optionalChoiceO)
			{
				this.optionalChoiceO = optionalChoiceO;
			}

		public String getOptionalChoiceT()
			{
				return optionalChoiceT;
			}

		public void setOptionalChoiceT(String optionalChoiceT)
			{
				this.optionalChoiceT = optionalChoiceT;
			}
		
		
		
	}
