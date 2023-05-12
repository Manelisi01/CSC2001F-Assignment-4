# binary search program makefile
# Manelisi Luthuli
# 15 April 2023

JAVAC=/usr/bin/javac
.SUFFIXES: .java .class

SRCDIR=src
BINDIR=bin

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<

.java.class:
	$(JAVAC) $<

CLASSES=BinaryTreeNode.class	BTQueueNode.class	BTQueue.class BinaryTree.class	BinarySearchTree.class	Post.class	Account.class	TokTik.class

CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default:$(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class
	

run:	$(CLASS_FILES)
	java -cp bin TokTik	
