import Adapters.MerniceServiceAdaptor;
import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.PlayerManager;
import Concretes.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(1, "Ayþenur", "Dayýoðlu", 1996, "5587390610");
		Game game = new Game(1, "Flappy Bird", 100);
		Campaign campaign = new Campaign(1, "Covid Ýndirimi", 30);

		PlayerManager playerManager = new PlayerManager(new MerniceServiceAdaptor());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();
		
		playerManager.add(player);
		gameManager.add(game);
		campaignManager.add(campaign);
		saleManager.sale(player, game, campaign);
		
	
	}

}
