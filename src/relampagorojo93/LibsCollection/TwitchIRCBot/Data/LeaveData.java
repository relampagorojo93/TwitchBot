package relampagorojo93.LibsCollection.TwitchIRCBot.Data;

import java.util.Map;

public class LeaveData extends Data {
	public LeaveData(Map<String,String> tags, String channel, String executor) {
		super(Action.LEAVE, tags, channel, executor);
	}
}
