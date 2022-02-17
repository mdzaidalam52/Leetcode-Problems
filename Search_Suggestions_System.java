class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
		Trie root = new Trie();
		for (String p : products) {
			root.insert(p);
		}
		return root.find(searchWord);
	}

	class Trie {
		class Node {
			Node[] child;
			boolean end;

			Node() {
				child = new Node[26];
				end = false;
			}
		}

		Node root;

		Trie() {
			root = new Node();
		}

		void insert(String str) {
			Node current = root;
			for (int i = 0; i < str.length(); i++) {
				if (current.child[str.charAt(i) - 'a'] != null) {
					current = current.child[str.charAt(i) - 'a'];
				} else {
					current.child[str.charAt(i) - 'a'] = new Node();
					current = current.child[str.charAt(i) - 'a'];
				}

			}
			current.end = true;
		}

		void search(Node n, List<String> l, StringBuilder str) {
			if (n == null)
				return;
			if (n.end)
				l.add(str.toString());
			if (l.size() == 3)
				return;
			for (int i = 0; i < 26; i++) {
				if (n.child[i] != null) {
					str.append((char) (i + 'a'));
					search(n.child[i], l, str);
					str.deleteCharAt(str.length() - 1);
				}
				if (l.size() == 3)
					return;
			}
		}

		List<List<String>> find(String str) {
			Node node = root;
			List<List<String>> l = new ArrayList<>();
			StringBuilder s = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
				node = node.child[str.charAt(i) - 'a'];
				if (node == null){
					while(i < str.length()){
                        l.add(new ArrayList<>());
                        i++;
                    }
                    continue;
                }
				s.append(str.charAt(i));
				List<String> t = new ArrayList<>();
				search(node, t, s);
				l.add(t);
			}
			return l;
		}

	}
}

// Code by Md Zaid Alam