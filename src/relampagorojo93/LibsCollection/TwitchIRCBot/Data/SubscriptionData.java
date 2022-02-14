package relampagorojo93.LibsCollection.TwitchIRCBot.Data;

import java.util.Map;

public class SubscriptionData extends MessageData {
	private int months;
	public SubscriptionData(Map<String,String> tags, String channel, String executor, String message, int months) {
		this(Action.SUBSCRIPTION, tags, channel, executor, message, months);
	}
	public SubscriptionData(Action action, Map<String,String> tags, String channel, String executor, String message, int months) {
		super(action, tags, channel, executor, message);
		this.months = months;
	}
	public int getMonths() {
		return months;
	}

}
