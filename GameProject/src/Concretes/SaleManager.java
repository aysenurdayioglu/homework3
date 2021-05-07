package Concretes;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements SaleService {

	@Override
	public void sale(Player player, Game game, Campaign campaign) {
		
		double discountPrice = game.getGamePrice() - (game.getGamePrice()*campaign.getDiscount()/100);
		
		System.out.println("Oyuncu " + player.getFirstName() + " " + player.getLastName() + " " +
								game.getGameName() + " oyununu %" + campaign.getDiscount() +
								" indirimle " + discountPrice + " TL ye aldý"	);
		
		
		
	}

}
