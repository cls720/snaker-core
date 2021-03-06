/* Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.engine.parser.impl;

import org.snaker.engine.model.DecisionModel;
import org.snaker.engine.model.NodeModel;
import org.snaker.engine.parser.AbstractNodeParser;
import org.w3c.dom.Element;

/**
 * 决策节点解析类
 * @author yuqs
 * @version 1.0
 */
public class DecisionParser extends AbstractNodeParser {
	/**
	 * 产生DecisionModel模型对象
	 */
	@Override
	protected NodeModel newModel() {
		return new DecisionModel();
	}

	/**
	 * 解析decisition节点的特有属性expr
	 */
	@Override
	protected void parseNode(NodeModel node, Element element) {
		DecisionModel decision = (DecisionModel)node;
		decision.setExpr(element.getAttribute(ATTR_EXPR));
		decision.setHandleClass(element.getAttribute(ATTR_HANDLECLASS));
	}
}
