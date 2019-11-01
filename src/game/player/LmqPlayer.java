package game.player;

import game.Manager;
import game.Player;
import game.Poker;

import java.util.List;

public class LmqPlayer implements Player {

    @Override
    public String getName() {
        return "李梦琦";
    }

    @Override
    public String getStuNum() {
        return "2019211293";
    }

    @Override
    public void onGameStart(Manager manager, int totalPlayer) {

    }

    @Override
    public int bet(int time, int round, int lastPerson, int moneyOnDesk, int moneyYouNeedToPayLeast, List<Poker> pokers) {
        return 0;
    }

    @Override
    public void onResult(int time, boolean isWin, List<Poker> pokers) {

    }
}
