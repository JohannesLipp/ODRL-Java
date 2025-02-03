package io.github.johanneslipp.odrljava.model.odrl.permissionsprohibitionsduties;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.IOException;

@JsonDeserialize(using = AbstractConstraint.CustomConstraintSerializer.class)
public abstract class AbstractConstraint {
    public AbstractConstraint() {
    }


    public static class CustomConstraintSerializer extends JsonDeserializer<AbstractConstraint> {

        @Override
        public AbstractConstraint deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            TreeNode node = jsonParser.readValueAsTree();

            if (node.get("operator") != null || node.get("rightOperand") != null || node.get("leftOperand") != null) {
                return jsonParser.getCodec().treeToValue(node, Constraint.class);
            } else {
                return jsonParser.getCodec().treeToValue(node, LogicalConstraint.class);
            }
        }
    }
}