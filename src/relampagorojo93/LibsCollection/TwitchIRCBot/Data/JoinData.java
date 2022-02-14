package relampagorojo93.LibsCollection.TwitchIRCBot.Data;

import java.util.Map;

public class JoinData extends Data {
	public JoinData(Map<String,String> tags, String channel, String executor) {
		super(Action.JOIN, tags, channel, executor);
	}
}
