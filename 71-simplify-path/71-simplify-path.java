class Solution {

    public String simplifyPath(String path) {
        List<String> paths = new ArrayList<>();
        String[] p = path.split("/");
        for (String a : p) {
            // System.out.println(a);
            if (a.equals("..")) {
                try {
                    paths.remove(paths.size() - 1);
                } catch (Exception e) {}
                // System.out.println("T");
            } else {
                if (a.contains(" ") || a.equals(".") || a.isBlank() || a.isBlank()) continue;
                paths.add(a);
                // System.out.println("F");
            }
        }

        if(paths.isEmpty()) return "/";
        StringBuilder ans = new StringBuilder();
        for (String a : paths) {
            ans.append("/");
            ans.append(a);
        }
        return ans.toString();
    }
}
