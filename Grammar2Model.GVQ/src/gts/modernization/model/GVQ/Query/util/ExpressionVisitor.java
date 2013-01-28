package gts.modernization.model.GVQ.Query.util;

import gts.modernization.model.GVQ.Query.FilterExpressionComplex;
import gts.modernization.model.GVQ.Query.FilterExpressionUnit;

public interface ExpressionVisitor {
	public void visit(FilterExpressionUnit filter);
	public void visit(FilterExpressionComplex filter);
}
