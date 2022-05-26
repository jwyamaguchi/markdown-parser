for file in test-files/*.md;
do
  echo $file
  java MarkdownParse $file
done

git clone https://github.com/nidhidhamnani/markdown-parser.git cse15lsp22-markdown-parser