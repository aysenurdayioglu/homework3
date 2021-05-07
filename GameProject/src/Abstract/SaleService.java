package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface SaleService {

	void sale(Player player, Game gamer, Campaign campaign);
}
