package gts.modernization.model.GVQ.Query.util;

public interface ExpressionVisitable {
	public void accept(ExpressionVisitor visitor);
}
